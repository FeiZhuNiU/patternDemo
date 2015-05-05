package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class GooseAdapter
        implements Quackable
{
    private Goose goose;

    public GooseAdapter(Goose goose)
    {
        this.goose = goose;
    }

    @Override
    public void quack()
    {
        goose.honk();
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
