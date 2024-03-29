package com.design.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    public void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    public void process() {
        for(Order order: orders) {
            order.process();
            orders.remove(order);
        }
    }

    public String report() {
        return "Total number of items made:" + catalog.totalItemsMade();
    }

}