package eric.yu.demo.proxy.rmi;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/4/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.rmi.Naming;

public class MyRemoteClient
{
    public static void main(String[] args)
    {
        new MyRemoteClient().go();
    }

    public void go()
    {
        try
        {
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
            System.out.println(service.sayHello("Eric"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
