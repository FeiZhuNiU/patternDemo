package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public abstract class AbstractDuckFactory
{
    abstract Quackable createMallardDuck();

    abstract Quackable createRedheadDuck();

    abstract Quackable createDuckCall();

    abstract Quackable createRubberDuck();

    abstract Quackable createGoose();

}
