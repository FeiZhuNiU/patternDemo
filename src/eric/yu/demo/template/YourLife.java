package eric.yu.demo.template;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class YourLife extends Life
{
    @Override
    protected void work()
    {
        System.out.println("has no work");
    }

    @Override
    protected void marriage()
    {
        System.out.println("single");
    }

    @Override
    protected void study()
    {
        System.out.println("no education background");
    }
}
