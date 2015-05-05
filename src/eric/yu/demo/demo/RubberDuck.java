package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class RubberDuck
        implements Quackable
{
    @Override
    public void quack()
    {
        System.out.println("RubberDuck: Squeak");
    }

    @Override
    public void addObserver(Observer observer)
    {

    }

    @Override
    public void notifyObservers()
    {

    }
}
