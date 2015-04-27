package eric.yu.demo.observer;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/27/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.Observable;

public class Child extends Observable
{
    public void cry(){
        System.out.println("child cry!!");
        setChanged();


        notifyObservers(this);
    }
}
