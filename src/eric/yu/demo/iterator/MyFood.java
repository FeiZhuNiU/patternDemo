package eric.yu.demo.iterator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/30/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.Iterator;

public class MyFood
{
    static final int MAX_ITEMS = 5;
    private Food[] foods;
    int numberOfFood = 0;

    public MyFood()
    {
        foods = new Food[MAX_ITEMS];

    }

    public void addFood(String name, double price){
        Food food = new Food(name,price);
        if(numberOfFood >= MAX_ITEMS){
            System.out.println("Food list is full , can not add any more!");
        }
        else {
            foods[numberOfFood++] = food;
        }
    }

    public Food[] getFoods()
    {
        return foods;
    }
    public Iterator<Food> getIterator(){
        return new MyFoodIterator(foods);
    }
}
