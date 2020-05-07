package com.datastructure.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
        dynamicArray.put(11);
        System.out.println("Size:" + dynamicArray.getSize());
        dynamicArray.put(12);
        System.out.println("Size:" + dynamicArray.getSize());
        dynamicArray.put(13);
        System.out.println("Size:" + dynamicArray.getSize());
        dynamicArray.put(14);
        System.out.println("Size:" + dynamicArray.getSize());
        dynamicArray.put(15);
        System.out.println("Size:" + dynamicArray.getSize());
        System.out.println("Element saved is:");
        for (int i = 0; i < dynamicArray.getSize(); i++)
            System.out.println(dynamicArray.get(i));
    }
}
