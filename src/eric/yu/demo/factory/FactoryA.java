package eric.yu.demo.factory;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/28/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class FactoryA extends Factory
{
    @Override
    protected Product produce(String name)
    {
        if(name.equals("A"))
            return new ProductA();
        else
            return new ProductB();

    }
}
