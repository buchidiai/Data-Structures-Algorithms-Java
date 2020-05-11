package com.datastructure.Queue.Array;

public class Main {
    public static void main(String[] args) {
        QueueWithArray<Integer> q = new QueueWithArray<Integer>(5);
        q.Queue(5);
        q.Queue(2);
        q.Queue(3);
        q.Queue(6);
        q.Queue(8);

        q.printQueue();

        System.out.println("De-queue:" + q.DeQueue());
        System.out.println("De-queue:" + q.DeQueue());
    }
}
