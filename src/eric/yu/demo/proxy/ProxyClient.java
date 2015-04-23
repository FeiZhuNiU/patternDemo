package eric.yu.demo.proxy;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class ProxyClient
{
    public static void main(String[] args)
    {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();
    }
}
