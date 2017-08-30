package com.qds;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qds.model.Item;
import com.qds.model.ItemFactory;
import com.qds.model.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public ModelAndView items() {
        return new ModelAndView("request", "command", new Request());
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String getItems(@ModelAttribute("SpringWeb") Item item, ModelMap model) {
        ArrayList<Item> items = ItemFactory.getItems();
        Collections.sort(items, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Gson gson = new Gson();
        Type type = new TypeToken<List<Item>>() {
        }.getType();
        String json = gson.toJson(items, type);
        model.addAttribute("results", items);
        model.addAttribute("json", json);
        return "result";
    }


}
