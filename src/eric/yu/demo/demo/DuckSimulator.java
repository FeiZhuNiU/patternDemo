package eric.yu.demo.demo;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/5/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class DuckSimulator
{
    public static void main(String[] args)
    {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory factory = new DuckFactory();
        AbstractGooseFactory factory1 = new GooseFactory();
        duckSimulator.simulate(factory,factory1);
    }

    void simulate(AbstractDuckFactory factory , AbstractGooseFactory gooseFactory)
    {


        Quackable mallardDuck1 = factory.createMallardDuck();
        Quackable mallardDuck2 = factory.createMallardDuck();
        Quackable mallardDuck3 = factory.createMallardDuck();
        Quackable mallardDuck4 = factory.createMallardDuck();

        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(gooseFactory.createGoose());


        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);

        flockOfDucks.add(flockOfMallards);


        System.out.println("\nDuck Simulator -------------------");

        QuackObserver observer = new QuackObserver();
        flockOfDucks.addObserver(observer);

        simulate(flockOfDucks);

        System.out.println("All ducks quack for " + QuackCountDecorator.getNumOfQuacks() + " times");
    }

    void simulate(Quackable duck)
    {
        duck.quack();
    }
}
