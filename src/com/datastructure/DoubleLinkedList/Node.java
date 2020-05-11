package com.datastructure.DoubleLinkedList;

public class Node {
    public  Object value;
    public Node next;
    public Node previous;

    public Node(Object value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
