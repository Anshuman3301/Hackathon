package com.stackroute.Oops;

public class BaseHamburger {
    int priceBaseBreadWithMeat=100;
    private int lettuce=12;
    private int tomato=11;
    private int carrot=13;
    private int fries=14;

    public void addLettuce()
    {
        priceBaseBreadWithMeat+=lettuce;
    }

    public void addTomato()
    {
        priceBaseBreadWithMeat+=tomato;
    }

    public void addCarrot()
    {
        priceBaseBreadWithMeat+=carrot;
    }

    public void addFries()
    {
        priceBaseBreadWithMeat+=fries;
    }
}
