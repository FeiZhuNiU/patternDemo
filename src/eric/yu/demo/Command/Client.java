package eric.yu.demo.Command;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class Client
{
    public static void main(String[] args)
    {
        Invoker invoker = new Invoker();
        Receiver receiver = new ReceiverA();

        Command command = new ConcreteCommandA(receiver);
        invoker.setCommand(command);
        invoker.invoke();
    }
}
