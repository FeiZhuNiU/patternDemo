package eric.yu.demo.proxy.dynamic;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/23/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//一个动态代理类可以代理任意多个目标类
public class DynamicSubject implements InvocationHandler
{
    private Object sub;

    public DynamicSubject(Object obj){
        this.sub = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("before");
        method.invoke(sub,args);
        System.out.println("after");
        return null;
    }
}
