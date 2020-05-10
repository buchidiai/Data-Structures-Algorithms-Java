package com.datastructure.Stack.LinkedList;

import com.datastructure.LinkedList.Node;

public class StackWithLinkedList<T> {
    Node top;

    public StackWithLinkedList() {
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
            System.out.println("stack is emplty");
            return null;
        }

        T value = (T) top.getValue();
        top.setNext(top);
        return value;
    }

}
