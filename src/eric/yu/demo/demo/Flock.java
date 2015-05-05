package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.ArrayList;

public class Flock implements Quackable
{
    ArrayList<Quackable> ducks;

    public Flock()
    {
        ducks = new ArrayList<Quackable>();
    }

    public void add(Quackable duck)
    {
        ducks.add(duck);
    }

    @Override
    public void quack()
    {
        for (Quackable duck : ducks)
        {
            duck.quack();
        }
    }

    @Override
    public void addObserver(Observer observer)
    {
        for(Quackable duck : ducks)
        {
            duck.addObserver(observer);
        }
    }

    @Override
    public void notifyObservers()
    {
        for(Quackable duck : ducks)
        {
            duck.notifyObservers();
        }
    }
}
