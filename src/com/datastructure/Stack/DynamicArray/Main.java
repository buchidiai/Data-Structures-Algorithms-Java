package com.datastructure.Stack.DynamicArray;

public class Main {
    public static void main(String[] args) {
        StackDynamicArray<Integer> stackWithDynamicArray = new StackDynamicArray<>(2);

        stackWithDynamicArray.push(12);
        stackWithDynamicArray.push(12);

        System.out.println("Size stack:" + stackWithDynamicArray.getSize());
        stackWithDynamicArray.push(12);
        System.out.println("Size stack:" + stackWithDynamicArray.getSize());

    }
}
