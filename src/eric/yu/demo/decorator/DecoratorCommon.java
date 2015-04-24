package eric.yu.demo.decorator;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/24/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public abstract class DecoratorCommon extends Decorator
{
    protected abstract void doAnotherThing();

    public DecoratorCommon(Component component)
    {
        super(component);
    }

    @Override
    public void doSomething()
    {
        super.doSomething();
        doAnotherThing();
    }
}
