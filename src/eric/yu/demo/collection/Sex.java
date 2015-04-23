package eric.yu.demo.collection;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/22/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/


public class Sex implements Cloneable
{
    public String sex;
    public Sex(String s)
    {
        sex = s;
    }

    @Override
    public String toString()
    {
        return "Sex{" +
                "sex='" + sex + '\'' +
                '}' + "@" + hashCode();
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
