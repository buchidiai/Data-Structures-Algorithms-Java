package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        HashSet<String> hs = new HashSet<String>();

        hs.add("Zim");
        hs.add("bread");
        hs.add("butter");
        hs.add("milk");
        hs.add("egg");

        //only unique values will be added { no duplicates and alphabetical ordered }
        ts.add("Mike");
        ts.add("Chris");
        ts.add("Tom");
        ts.add("Jim");
        ts.add("Jeff");
        ts.add("Jeff");
        ts.add("Jeff");
        ts.add("Tom");
        ts.add("Alex");

        //tree set can only be iterated through
        Iterator<String> itr = ts.iterator();
        //check if it has next item and print them out
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("****************");

        //HashSet can only be iterated through
        Iterator<String> itrs = hs.iterator();
        //check if it has next item and print them out
        while (itrs.hasNext()) {
            System.out.println(itrs.next());
        }
    }
}
