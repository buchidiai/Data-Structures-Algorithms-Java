package com.datastructure.Queue.DynamicArray;

public class Main {
    public static void main(String[] args) {
        QueueDynamicArray<Integer> q = new QueueDynamicArray<>(2);

        q.Queue(11);
        q.Queue(12);
        q.Queue(1);
        q.Queue(9);
        System.out.println("Size:" + q.getSize());
        q.Queue(8);
        q.DeQueue();
        System.out.println("Size:" + q.getSize());


    }
}
