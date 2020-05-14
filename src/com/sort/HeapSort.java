package com.sort;

public class HeapSort {
    static int total;

    public static void main(String[] args) {
        Integer[] arr = {1, 50, 30, 10, 60, 80, 45, 65, 75, 345, 24, 65};

        System.out.println("Before Sort");
        printArray(arr);


        sort(arr);
        System.out.println("\nAfter Sort");
        printArray(arr);
    }

    static void sort(Comparable[] arr) {
        total = arr.length - 1;
        for (int i = total / 2; i >= 0; i--)
            heapify(arr, i);
        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }
    }


    static void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void heapify(Comparable[] arr, int i) {
        int lft = i * 2;
        int rgt = i * 2 + 1;
        int grt = i;
        if (lft <= total && arr[lft].compareTo(arr[grt]) >= 0)
            grt = lft;
        if (rgt <= total && arr[rgt].compareTo(arr[grt]) >= 0)
            grt = rgt;
        if (grt != i) {
            swap(arr, i, grt);
            heapify(arr, grt);
        }
    }


    static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }

}
