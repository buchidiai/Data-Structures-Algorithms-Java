package com.datastructure.LinkedList;

public class LinkedListU<T> {
    Node head;

    public LinkedListU() {
        head = null;
    }

    public void add(Object value) {
        //create new node and pass null as next
        Node newNode = new Node(value, null);
        //if no node then head is newNode
        if (head == null) {
            head = newNode;
        } else {
            //if there is a node then add head to the next
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete() {
        head = head.next;

    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.println((T) n.value);
            n = n.next;
        }
    }
}
