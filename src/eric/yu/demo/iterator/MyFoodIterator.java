package eric.yu.demo.iterator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/30/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.Iterator;

public class MyFoodIterator implements Iterator<Food>
{
    private Food[] foods;

    int pos = 0;

    public MyFoodIterator(Food[] foods)
    {
        this.foods = foods;
    }

    @Override
    public boolean hasNext()
    {
        return !(pos >= foods.length || foods[pos] == null);
    }

    @Override
    public Food next()
    {
        return foods[pos++];
    }

    @Override
    public void remove()
    {
        if(pos <= 0){
            System.out.println("there is no food ! ");
        }
        else {

        }
    }
}
