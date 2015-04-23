package eric.yu.demo.collection;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/22/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/


public class Person implements Cloneable
{
    public int age;
    public Sex sex;
    public Person(int a, Sex s){
        age = a;
        sex = s;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "age=" + age +
                ", sex=" + sex +
                '}' + "@" + hashCode();
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setSex(Sex sex)
    {
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Person p = null;
        p = (Person)super.clone();
        p.sex = (Sex)sex.clone();
        return p;
    }
}
