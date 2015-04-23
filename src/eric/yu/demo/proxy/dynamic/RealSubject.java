package eric.yu.demo.proxy.dynamic;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class RealSubject
        implements Subject
{
    @Override
    public void requset()
    {
        System.out.println("in real subject");
    }
}
