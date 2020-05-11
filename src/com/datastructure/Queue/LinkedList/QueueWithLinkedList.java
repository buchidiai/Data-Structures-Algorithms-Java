package com.datastructure.Queue.LinkedList;

import com.datastructure.DoubleLinkedList.Node;

public class QueueWithLinkedList<T> {
    Node Rear;
    Node Front;

    public QueueWithLinkedList() {
        Rear = null;
        Front = null;
    }

    public void Queue(Object value) {
        Node newNode = new Node(value, null, null);
        if (Rear == null || Front == null) {
            Rear = newNode;
            Front = newNode;
        } else {
            newNode.next = null;
            newNode.previous = Rear;
            Rear.next = newNode;
            Rear = newNode;
        }
    }

    public T Dequeue() {
        if (Rear == null || Front == null) {
            System.out.println("queue is empty");
            return null;
        }
        T value = (T) Front.value;
        Front = Front.next;
        if (Front != null)
            Front.previous = null;
        return value;

    }
}
