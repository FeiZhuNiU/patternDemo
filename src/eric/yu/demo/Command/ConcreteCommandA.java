package eric.yu.demo.Command;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class ConcreteCommandA implements Command
{
    Receiver receiver;
    public ConcreteCommandA(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void excute()
    {
        receiver.doSomethingA();
        receiver.doSomethingB();
    }

    @Override
    public void undo()
    {
        System.out.println("undo complete");
    }
}
