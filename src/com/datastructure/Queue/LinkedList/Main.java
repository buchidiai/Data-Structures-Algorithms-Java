package com.datastructure.Queue.LinkedList;

public class Main {

    public static void main(String[] args) {
        QueueWithLinkedList<String> q = new QueueWithLinkedList<String>();
        q.Queue("John");
        q.Queue("Lala");
        q.Queue("Harold");

        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());


    }
}
