package eric.yu.demo.proxy.dynamic;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyClient
{
    public static void main(String[] args)
    {
        RealSubject realSubject = new RealSubject();

        InvocationHandler handler = new DynamicSubject(realSubject);

        //一个动态代理类对应一个invocationhandler

        //动态生成一个代理对象，实现了 interfaces 所指定的接口， 并在调用该对象方法的时候 转发给handler所对应的动态代理类
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),handler);

        subject.requset();

    }
}
