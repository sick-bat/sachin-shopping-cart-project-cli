package com.shoppingcart.cart;

import java.util.ArrayList;

import com.shoppingcart.item.Item;
import com.shoppingcart.user.User;

public class Cart { 

    private int id;
    private User user;
    private ArrayList<Item> items = new ArrayList<>();
    private double totalPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }   
}