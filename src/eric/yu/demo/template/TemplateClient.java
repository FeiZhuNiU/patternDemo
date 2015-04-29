package eric.yu.demo.template;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/29/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class TemplateClient
{
    public static void main(String[] args)
    {
        Life life = new MyLife();
        Life life1 = new YourLife();
        System.out.println("MyLife:");
        life.showLife();
        System.out.println("Your Life : ");
        life1.showLife();
    }
}
