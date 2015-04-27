package eric.yu.demo.observer;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/27/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public class ObserverClient
{
    public static void main(String[] args)
    {
        Child child = new Child();
        Father father = new Father(child);
        Mother mother = new Mother(child);

        child.cry();
        child.cry();
    }
}
