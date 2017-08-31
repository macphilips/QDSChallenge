package com.qds;

import com.google.gson.Gson;
import com.qds.model.Item;
import com.qds.model.ItemFactory;
import com.qds.model.Request;
import com.qds.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by MOROLANI on 8/29/2017.
 */
@Controller
public class QDSController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }


    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String getItems(ModelMap model) {
        computeResult(model, null, null);
        return "result";
    }

    @RequestMapping(value = "/result/{col:.+}/{sort:.+}", method = RequestMethod.GET)
    public String getItemsWithOrder(@PathVariable("col") String col, @PathVariable("sort") String sort, ModelMap model) {
        computeResult(model, col, sort);

        return "result";
    }

    private void computeResult(ModelMap model, String col, String sort) {
        ArrayList<Item> items = ItemFactory.getItems();
        Comparator<Item> asc_name = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Item> desc_name = (o1, o2) -> o2.getName().compareTo(o1.getName());

        Comparator<Item> asc_price = (o1, o2) -> o1.getPrice().compareTo(o2.getPrice());
        Comparator<Item> desc_price = (o1, o2) -> o2.getPrice().compareTo(o1.getPrice());

        Comparator<Item> asc_color = (o1, o2) -> o1.getColor().compareTo(o2.getColor());
        Comparator<Item> desc_color = (o1, o2) -> o2.getColor().compareTo(o1.getColor());

        Comparator<Item> sort_order;

        Result result = new Result();
        if (sort != null && col != null) {
            if (col.equalsIgnoreCase("name")) {
                if (sort.equalsIgnoreCase("asc")) {
                    sort_order = asc_name;
                } else {
                    sort_order = desc_name;
                }
            } else if (col.equalsIgnoreCase("price")) {
                if (sort.equalsIgnoreCase("asc")) {
                    sort_order = asc_price;
                } else {
                    sort_order = desc_price;
                }
            } else {
                if (sort.equalsIgnoreCase("asc")) {
                    sort_order = asc_color;
                } else {
                    sort_order = desc_color;
                }
            }

            if (sort.equalsIgnoreCase("asc")) {
                result.setOrder("desc");
            } else {
                result.setOrder("asc");
            }
            result.setColumn(col);

        } else {
            sort_order = asc_name;
            result.setOrder("asc");
            result.setColumn("name");
        }
        Collections.sort(items, sort_order);
        result.setItems(items);

        Gson gson = new Gson();
        String json = gson.toJson(result);
        // String json =   new Gson().toJson(items, new TypeToken<List<Item>>() {
        //}.getType());
        model.addAttribute("results", items);
        model.addAttribute("json", json);
    }

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public ModelAndView items() {
        return new ModelAndView("request", "command", new Request());
    }


}
