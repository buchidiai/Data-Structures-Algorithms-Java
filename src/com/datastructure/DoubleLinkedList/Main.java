package com.datastructure.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<String>();

        doubleLinkedList.add("Dollar");
        doubleLinkedList.add("Pound");
        doubleLinkedList.add("Naira");
        doubleLinkedList.add("Peso");
        doubleLinkedList.add("Yen");
        doubleLinkedList.add("Cowry");

        System.out.println("before delete");
        doubleLinkedList.display();
        System.out.println("after delete");
        doubleLinkedList.delete();
        doubleLinkedList.display();


    }
}
