package com.datastructure.LinkedList;

public class Node {
    Object value;
    Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
        System.out.println(value + " Value");
        System.out.println(next + " Next");
    }

}
