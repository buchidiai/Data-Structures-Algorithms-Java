package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        //create instance of hash map
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //insert into hashmap
        hmap.put(1, "Get bread");
        hmap.put(2, "Get Milk");
        hmap.put(3, "Get Water");
        hmap.put(4, "Go to mall");
        hmap.put(6, "Take kids to park");
        hmap.put(7, "wear mask");
        hmap.put(8, "Buy wine");

        //print hashmap
        System.out.println(hmap.get(2));
        System.out.println(hmap.get(6));
        System.out.println(hmap.get(8));

        System.out.println("***********************");

        //loop through hashmap
        for (Map.Entry m : hmap.entrySet()) {
            System.out.println("Key: " + m.getKey() + ", value: " + m.getValue());
        }

        System.out.println("***********************");

        //update hashmap
        hmap.put(1, "Get soft bread");
        
        System.out.println(hmap.get(1));


    }
}
