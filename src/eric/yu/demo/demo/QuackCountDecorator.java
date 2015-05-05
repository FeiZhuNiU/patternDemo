package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class QuackCountDecorator
        implements Quackable
{
    private Quackable duck;

    public QuackCountDecorator(Quackable duck)
    {
        this.duck = duck;
    }

    private static int numOfQuacks = 0;

    public static int getNumOfQuacks()
    {
        return numOfQuacks;
    }

    @Override
    public void quack()
    {
        numOfQuacks++;
        duck.quack();
    }

    @Override
    public void addObserver(Observer observer)
    {
        duck.addObserver(observer);
    }

    @Override
    public void notifyObservers()
    {
        duck.notifyObservers();
    }
}
