package com.datastructure.Queue.LinkedList;

import com.datastructure.LinkedList.Node;

public class QueueWithLinkedList<T> {
    Node top;

    public QueueWithLinkedList() {
        top = null;
    }

    public void push(Object value) {
        Node newNode = new Node(value, null);
        if (top == null)
            top = newNode;
        else {
            newNode.setNext(top);
            top = newNode;
        }
    }

    public T pop() {
        if (top == null) {
            System.out.println("stack is empty");
            return null;
        }

        T value = (T) top.getValue();
        top.setNext(top);
        return value;
    }

}
