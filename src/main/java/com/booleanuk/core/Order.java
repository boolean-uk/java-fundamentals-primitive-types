package com.booleanuk.core;

public class Order {
    public int id = 672439;
    public String street = "Main Street";
    public String city = "Athens";
    public int postalCode = 11363;
    public double price = 37.99;
    public int deliveryFee = 15;
    public double totalPrice = price + deliveryFee;
    public int customer_id = 81;    //inherited usually
    public boolean isGift = false;
    public String[] products = {"HyperX Headset", "Razer Mouse"};
}
