package com.datastructure.Hash;

public class Main {

    public static void main(String[] args) {
        HashTableArray<String> hashTable = new HashTableArray<String>(10);
        hashTable.put(11, "Chris");
        hashTable.put(12, "Mike");
        hashTable.put(14, "tobi");
        hashTable.put(15, "Yu");
        hashTable.put(16, "me");


        System.out.println(hashTable.get(11));
        System.out.println(hashTable.get(16));
    }
}
