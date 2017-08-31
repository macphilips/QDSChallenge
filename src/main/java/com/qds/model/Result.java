package com.qds.model;

import java.util.ArrayList;

/**
 * Created by MOROLANI on 8/31/2017.
 */
public class Result {
    private ArrayList<Item> items;
    private String column;
    private String order;

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
