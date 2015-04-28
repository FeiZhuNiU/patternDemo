package eric.yu.demo.factory;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/28/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class Customer
{
    public static void main(String[] args)
    {
        Factory factory = new FactoryA();
        factory.order("B");

        Factory factory1 = new FactoryB();
        factory1.order("B");
    }
}
