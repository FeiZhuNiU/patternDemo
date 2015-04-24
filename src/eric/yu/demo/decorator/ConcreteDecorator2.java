package eric.yu.demo.decorator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/24/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class ConcreteDecorator2 extends DecoratorCommon
{
    public ConcreteDecorator2(Component component)
    {
        super(component);
    }

    protected void doAnotherThing()
    {
        System.out.println("concrete2 do another thing ");
    }
}
