package com.sort;


public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {1, 50, 30, 10, 60, 80, 456, 443, 434, 465, 2, 45, 234, 565, 2324, 34, 465, 56, 16, 33};
        System.out.println("Before Sort");
        printArray(arr);
        SelectionSort(arr);
        System.out.println("\nAfter Sort");
        printArray(arr);
    }

    static void SelectionSort(int[] arr) {
        //loop through array
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            //2nd loop
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }

            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }


    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
