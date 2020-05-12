package com.collections;

import com.datastructure.OneDimensionArray.Student;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    //first in first out
    public static void main(String[] args) {

        System.out.println("**********basic queue**********");
        //unordered elements
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(15);
        q.add(11);
        q.add(10);
        q.add(14);
        System.out.println(q + "  q");
        System.out.println(q.poll()); //remove 1st element

        System.out.println("**********priority queue**********");
        // PriorityQueue orders elements
        //duplicates allowed
        PriorityQueue<Integer> qp = new PriorityQueue<Integer>();
        qp.add(15);
        qp.add(11);
        qp.add(10);
        qp.add(10);
        qp.add(14);
        qp.add(16);
        qp.add(190);
        qp.add(76);
        System.out.println(qp + "  qp");
        System.out.println(qp.poll());
        System.out.println(qp.poll());
        System.out.println(qp + "  qp");
        System.out.println(qp.poll());
        System.out.println(qp + "  qp");


        System.out.println("**********priority queue for students**********");


        PriorityQueue<Student> pStudends = new PriorityQueue<Student>();

        pStudends.add(new Student("Hussein", 27));
        pStudends.add(new Student("Jena", 2));
        pStudends.add(new Student("Laya", 1));
        pStudends.add(new Student("Tim", 3));
        pStudends.add(new Student("Alex", 5));


        System.out.println(pStudends.toString() + "pStudent");
        System.out.println(pStudends.poll().getName());
    }
}
