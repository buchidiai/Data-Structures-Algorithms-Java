package com.datastructure.Stack.LinkedList;

public class Main {

    public static void main(String[] args) {
        StackWithLinkedList<String> stackWithLinkedList = new StackWithLinkedList<String>();



        stackWithLinkedList.pop(); //empty
        stackWithLinkedList.push("John");
        stackWithLinkedList.push("Mike");
        stackWithLinkedList.push("Jim");
        stackWithLinkedList.push("JJ");



        stackWithLinkedList.pop();
        stackWithLinkedList.pop();
        stackWithLinkedList.pop();
        stackWithLinkedList.pop();
        stackWithLinkedList.pop();
    }
}
