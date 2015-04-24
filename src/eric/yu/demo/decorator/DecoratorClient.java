package eric.yu.demo.decorator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/24/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class DecoratorClient
{
    public static void main(String[] args)
    {
        Component component = new ConcreteDecorator1(new ConcreteComponent());
        component.doSomething();

        Component component1 = new ConcreteDecorator2(new ConcreteComponent());
        component1.doSomething();

        Component component2 = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
        component2.doSomething();
    }
}
