package com.datastructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        linkedlist.add("Dollar");
        linkedlist.add("Pound");
        linkedlist.add("Naira");
        linkedlist.add("Peso");
        linkedlist.add("Yen");
        linkedlist.add("Cowry");

        System.out.println("before delete");
        linkedlist.display();
        System.out.println("after delete");
        linkedlist.delete();
        linkedlist.display();


    }
}
