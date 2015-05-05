package eric.yu.demo.proxy.rmi;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/4/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote
{

    protected MyRemoteImpl() throws RemoteException
    {
    }

    @Override
    public String sayHello(String name) throws RemoteException
    {
        return "hello " + name;
    }

    public static void main(String[] args)
    {
        try
        {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
