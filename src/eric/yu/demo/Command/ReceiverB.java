package eric.yu.demo.Command;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class ReceiverB implements Receiver
{
    public void doSomethingA(){
        System.out.println("receiverB doSomethingA");
    }

    public void doSomethingB(){
        System.out.println("receiverB doSomethingB");
    }
}
