package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class QuackObserver implements Observer
{
    @Override
    public void update(Quackable duck)
    {
        System.out.println(" +++ Quack Observer : " + duck + " just quacked ++++");
    }
}
