package com.stackroute.Oops;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which burger would you like press1 for Base press 2 for Deluxe(No additionals) press 3 for Healthy:");
        int type= scanner.nextInt();
        System.out.println("Number of Burgers");
        int number=scanner.nextInt();
        if(type==1)
        {
            BaseHamburger baseHamburger=new BaseHamburger();
            System.out.println("what additionals do you want");
            String order=scanner.next();
            String[] orders=order.split(" ");
            for(int i=0;i<orders.length;i++)
            {
                if(orders[i].equals("lettuce"))
                {
                    baseHamburger.addLettuce();
                }
                else if(orders[i].equals("tomato"))
                {
                    baseHamburger.addTomato();
                }
                else if(orders[i].equals("carrot"))
                {
                    baseHamburger.addCarrot();
                }
                else
                {
                    baseHamburger.addFries();
                }
            }

            System.out.println(baseHamburger.priceBaseBreadWithMeat*number);
        }
        else if(type==2)
        {
            DeluxeHamburger deluxeHamburger=new DeluxeHamburger();
            System.out.println(deluxeHamburger.priceBaseBurger*number);
        }
        else
        {
            System.out.println("Tell the additionals (only 2)");
            String order= scanner.next();
            HealthyHamburger healthyHamburger=new HealthyHamburger();
            String[] orders=order.split(" ");
            for(int i=0;i<orders.length;i++)
            {
                if(orders[i].equals("lettuce"))
                {
                    healthyHamburger.addLettuce();
                }
                else if(orders[i].equals("tomato"))
                {
                    healthyHamburger.addTomato();
                }
                else if(orders[i].equals("carrot"))
                {
                    healthyHamburger.addCarrot();
                }
                else
                {
                    healthyHamburger.addFries();
                }
            }

            System.out.println((healthyHamburger.healthyBurger+healthyHamburger.onions+healthyHamburger.cheese)*number);

        }

    }
}
