package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.ArrayList;

public class QuackObservable implements Observable
{
    ArrayList<Observer> observers;
    Quackable duck;
    public QuackObservable(Quackable duck)
    {
        this.duck = duck;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void notifyObservers()
    {
        for(Observer observer:observers)
            observer.update(duck);
    }
}
