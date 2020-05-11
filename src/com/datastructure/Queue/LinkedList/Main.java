package com.datastructure.Queue.LinkedList;

public class Main {

    public static void main(String[] args) {
        QueueWithLinkedList<String> stackWithLinkedList = new QueueWithLinkedList<String>();



        stackWithLinkedList.pop(); //empty
        stackWithLinkedList.push("John");
        stackWithLinkedList.push("Mike");
        stackWithLinkedList.push("Jim");
        stackWithLinkedList.push("JJ");



        stackWithLinkedList.pop();

    }
}
