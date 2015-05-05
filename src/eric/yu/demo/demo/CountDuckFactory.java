package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class CountDuckFactory extends AbstractDuckFactory
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
        return new QuackCountDecorator(new DuckCall());
    }

    @Override
    Quackable createRubberDuck()
    {
        return new QuackCountDecorator(new RubberDuck());
    }

    @Override
    Quackable createGoose()
    {
        return new QuackCountDecorator(new GooseAdapter(new Goose()));
    }
}
