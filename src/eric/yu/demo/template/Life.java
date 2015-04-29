package eric.yu.demo.template;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public abstract class Life
{
    public void showLife()
    {
        born();
        study();
        marriage();
        work();
        die();
    }

    protected void die()
    {
        System.out.println("die !! ");
    }

    protected abstract void work();

    protected abstract void marriage();


    protected abstract void study();

    protected void born()
    {
        System.out.println("borned! ");
    }
}
