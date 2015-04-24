package eric.yu.demo.decorator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/24/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class ConcreteComponent
        implements Component
{
    @Override
    public void doSomething()
    {
        System.out.println("int concrete component");
    }
}
