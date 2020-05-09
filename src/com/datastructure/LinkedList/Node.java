package com.datastructure.LinkedList;

public class Node {
    Object value;
    Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
