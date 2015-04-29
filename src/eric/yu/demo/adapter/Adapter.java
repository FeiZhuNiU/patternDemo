package eric.yu.demo.adapter;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class Adapter implements Target
{
    Adaptee adaptee;
    public Adapter(Adaptee adaptee)
    {
        this.adaptee = adaptee;
    }
    @Override
    public void request()
    {
        adaptee.myRequest();
    }
}
