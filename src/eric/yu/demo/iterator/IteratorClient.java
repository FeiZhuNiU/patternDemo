package eric.yu.demo.iterator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/30/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.Iterator;

public class IteratorClient
{
    public static void main(String[] args)
    {
        MyFood food = new MyFood();
        food.addFood("A",1.1);
        food.addFood("B",2.2);
        food.addFood("C",3.2);
        food.addFood("D",4.2);
        food.addFood("E",5.2);
        food.addFood("F",6.2);

        Iterator<Food> itr = food.getIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
