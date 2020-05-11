package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Mike");
        ll.add("Chris");
        ll.add("Tom");
        ll.add("Jim");
        ll.add("Jeff");

        //link list can only be iterated through
        Iterator<String> itr = ll.iterator();
        //check if it has next item and print them out
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
