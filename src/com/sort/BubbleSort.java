package com.sort;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {1, 50, 30, 10, 60, 80, 45, 6, 57, 32, 5435, 234, 4543, 2, 14, 45};

        printArray(arr);
        BubbleSort(arr);

        System.out.println("\nAfter Sort");

        printArray(arr);
    }


    static void BubbleSort(int[] arr) {
        int n = arr.length; //length on array
        int temp = 0; //temp value holder
        for (int i = 0; i < n; i++)
            for (int j = 1; j < (n - i); j++) {
                //check if the 0 (index) item in array is > 1 (index)
                //set temp to 0 (current) item in array
                //set 0 item to next item in index
                //next item to temp

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }


}
