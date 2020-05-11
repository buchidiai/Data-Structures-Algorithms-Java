package com.datastructure.Queue.DynamicArray;

public class Main {
    public static void main(String[] args) {
        QueueDynamicArray<Integer> stackWithDynamicArray = new QueueDynamicArray<>(2);

        stackWithDynamicArray.push(12);
        stackWithDynamicArray.push(12);
        stackWithDynamicArray.push(17);
        stackWithDynamicArray.push(19);

        System.out.println("Size stack:" + stackWithDynamicArray.getSize());
        stackWithDynamicArray.push(12);
        System.out.println("Size stack:" + stackWithDynamicArray.getSize());

    }
}
