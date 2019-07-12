package com.stackroute.Oops;

public class DeluxeHamburger {
    int priceBaseBurger=100;
    private int drinks=16;
    private int chips=17;

    public int orderDeluxe(int numOfBurgers)
    {
        int price=priceBaseBurger+drinks+chips;
        return price*numOfBurgers;
    }
}
