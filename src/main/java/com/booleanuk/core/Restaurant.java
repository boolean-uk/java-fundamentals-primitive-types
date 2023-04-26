package com.booleanuk.core;

public class Restaurant {
    public String category = "Fast Food";
    public String name = "Juicy Burgers";
    public int tables = 13;
    public int waiters = 3;
    public boolean openOnSundays = true;
    public String[] burgers = {"Cheese", "Hangover", "Special", "BBQ", "Juicy", "Vegan"};
    public String[] sides = {"Coca Cola", "french Fries", "Onion Rings", "Ice Cream", "Salad"};
    public String[] combos = {burgers[0]+" with "+sides[1], burgers[5]+" with "+sides[4]};
    public boolean delivery = false;
    public String speciality = burgers[4];
    public String location = "Monastiraki, Athens";

}
