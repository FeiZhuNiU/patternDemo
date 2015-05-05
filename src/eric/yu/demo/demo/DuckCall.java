package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class DuckCall
        implements Quackable
{
    QuackObservable observable;

    public DuckCall()
    {
        observable = new QuackObservable(this);
    }

    @Override
    public void quack()
    {
        System.out.println("DuckCall: Kwak");
        observable.notifyObservers();
    }

    @Override
    public void addObserver(Observer observer)
    {
        observable.addObserver(observer);
    }

    @Override
    public void notifyObservers()
    {
        observable.notifyObservers();
    }
}
