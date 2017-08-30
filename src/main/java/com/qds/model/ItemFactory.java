package com.qds.model;

import java.util.ArrayList;

/**
 * Created by MOROLANI on 8/29/2017.
 */
public class ItemFactory {

    private static ArrayList<Item> items = new ArrayList<>();

    public static ArrayList<Item> getItems() {
        Item item1 = new Item();
        item1.setColor("Blue");
        item1.setName("Benz");
        item1.setPrice("N10,000,000");
        items.add(item1);

        Item item2 = new Item();
        item2.setName("Toyota");
        item2.setColor("Red");
        item2.setPrice("N10,000,000");
        items.add(item2);

        Item item3 = new Item();
        item3.setName("Volvo");
        item3.setColor("Black");
        item3.setPrice("N10,000,000");
        items.add(item3);

        Item item4 = new Item();
        item4.setName("Kia");
        item4.setColor("Pink");
        item4.setPrice("N10,000,000");
        items.add(item4);

        Item item5 = new Item();
        item5.setName("Jaguar");
        item5.setColor("Yellow");
        item5.setPrice("N10,000,000");

        items.add(item5);

        return items;
    }

}
