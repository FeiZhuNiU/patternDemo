package eric.yu.demo.adapter;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class AdapterClient
{

    public static void main(String[] args)
    {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
