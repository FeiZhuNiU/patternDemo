package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class DuckFactory
        extends AbstractDuckFactory
{
    @Override
    Quackable createMallardDuck()
    {
        return new QuackCountDecorator(new MallardDuck());
    }

    @Override
    Quackable createRedheadDuck()
    {
        return new QuackCountDecorator(new RedheadDuck());
    }

    @Override
    Quackable createDuckCall()
    {
        return new DuckCall();
    }

    @Override
    Quackable createRubberDuck()
    {
        return new RubberDuck();
    }

    @Override
    Quackable createGoose()
    {
        return new GooseAdapter(new Goose());
    }
}
