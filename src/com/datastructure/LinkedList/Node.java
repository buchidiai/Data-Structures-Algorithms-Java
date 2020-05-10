package com.datastructure.LinkedList;

public class Node {
    Object value;
    Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
