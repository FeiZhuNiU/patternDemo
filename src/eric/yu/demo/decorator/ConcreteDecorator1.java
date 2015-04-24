package eric.yu.demo.decorator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/24/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class ConcreteDecorator1 extends DecoratorCommon
{

    public ConcreteDecorator1(Component component)
    {
        super(component);
    }

    protected void doAnotherThing(){
        System.out.println("Concrete1 do another thing");
    }
}
