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

        //1st loop
        //loop through before last element in array
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            //2nd loop
            for (int j = i + 1; j < arr.length; j++) {
                //check if ( current index + 1 ) < current index
                //set index to ( current index + 1 )
                if (arr[j] < arr[index])
                    index = j;
            }

            //1st loop
            //check if current index from 2nd loop != index from 1st loop
            if (index != i) {
                //set current index + 1 to temp
                int temp = arr[index];
                //set current index + 1 to current index
                arr[index] = arr[i];
                //set current index to current index + 1
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
