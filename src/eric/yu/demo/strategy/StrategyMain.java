package eric.yu.demo.strategy;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class StrategyMain
{
    public static void main(String[] args)
    {
        Context context = new Context(new Dog());
        context.say();

        context = new Context(new Man());
        context.say();
    }
}
