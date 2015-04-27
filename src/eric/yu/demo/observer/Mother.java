package eric.yu.demo.observer;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/27/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import java.util.Observable;
import java.util.Observer;

public class Mother extends Parent
{


    protected Mother(Observable child)
    {
        super(child);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        super.update(o, arg);
        System.out.println("Mother come!");
    }
}
