package eric.yu.demo.proxy.rmi;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 5/4/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote
{
    public String sayHello(String name) throws RemoteException;
}
