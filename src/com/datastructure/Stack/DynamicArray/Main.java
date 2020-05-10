package com.datastructure.Stack.Array;

public class Main {
    public static void main(String[] args) {
        StackArray<Integer> stackWithArray = new StackArray<Integer>(5);
        stackWithArray.push(10);
        stackWithArray.push(12);
        stackWithArray.push(13);
        stackWithArray.push(14);
        stackWithArray.push(15);
        stackWithArray.push(16);
        while (!stackWithArray.isEmplty()) {
            System.out.println(stackWithArray.pop());
        }
        stackWithArray.pop();

    }
}
