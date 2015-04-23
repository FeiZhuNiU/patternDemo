package eric.yu.demo.proxy;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class ProxySubject implements Subject
{
    RealSubject realSubject;
    @Override
    public void request()
    {
        preRequest();
        if(realSubject == null)
            realSubject = new RealSubject();

        realSubject.request();
        postRequest();
    }

    private void preRequest(){
        System.out.println("pre request");
    }

    private void postRequest(){
        System.out.println("post request");
    }
}
