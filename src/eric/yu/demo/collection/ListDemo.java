package eric.yu.demo.collection;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/22/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.util.*;

public class ListDemo
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(2,4));
        System.out.println(list2.toString());
        list2.set(0,7);
        System.out.println(list.toString());
        System.out.println(list2.toString());

//        ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
//        list2.set(2,8);
//
//
//
//        System.out.println(list.toString());
//        System.out.println(list2.toString());
//
//        ArrayList<Person> persons = new ArrayList<Person>();
//        persons.add(new Person(1,new Sex("female")));
//        persons.add(new Person(2,new Sex("male")));
//        System.out.println(persons.toString());
//
//        Deque<Integer> deque = new LinkedList<Integer>();
//        deque.add(2);
//        deque.add(2);
//        deque.add(4);
//        deque.add(1);
//        deque.add(1);
//        deque.add(6);
//        deque.add(7);
//
//        deque.offer(10);
//
//        System.out.println(deque.toString());
//
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        queue.add(2);
//        queue.poll();
//
//
//        System.out.println(queue.toString());
//
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(deque);
//        System.out.println(priorityQueue.toString());
//        while (!priorityQueue.isEmpty())
//        {
//            System.out.print(priorityQueue.poll() + " ");
//        }
//
//
//        TreeSet<Integer> treeSet = new TreeSet<Integer>();
//        treeSet.add(1);
//        treeSet.add(4);
//        treeSet.add(3);
//        treeSet.add(2);
//        treeSet.add(10);
//        treeSet.add(20);
//
//        System.out.println(treeSet.floor(11));
//
//
//        ArrayList<Person> persons1 = new ArrayList<Person>(persons);
//
//        persons1.get(0).setSex(new Sex("male"));
//
//
//        System.out.println(persons.toString());
//        System.out.println(persons1.toString());
////
////
////        Person p1 = new Person(10,new Sex("male"));
////        Person p2 = (Person) p1.clone();
////        p2.setSex(new Sex("female"));
////        p2.setAge(20);
////
////        System.out.println(p1);
////        System.out.println(p2);
//        ArrayList<Integer> list2 =

    }
}
