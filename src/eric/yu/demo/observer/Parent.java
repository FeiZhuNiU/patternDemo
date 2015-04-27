package eric.yu.demo.observer;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/27/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.Observable;
import java.util.Observer;

public abstract class Parent implements Observer
{
    Observable child;

    protected Parent(Observable child)
    {
        this.child = child;
        child.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {

    }
}
