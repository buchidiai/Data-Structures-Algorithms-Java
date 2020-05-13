package com.sort;

public class MergeSort {
    int[] array;
    int[] TempArray;

    public static void main(String[] args) {

        int[] arr = {1, 50, 30, 10, 60, 80, 435, 46, 346, 56, 3, 5, 45, 457, 7, 45, 68, 56};
        System.out.println("Before sorting");

        printArray(arr);

        new MergeSort().PrepareForSort(arr);

        System.out.println("\nAfter sorting");
        printArray(arr);

    }

    void PrepareForSort(int[] arr) {
        // prepare for sort
        this.array = arr;
        this.TempArray = new int[arr.length];
        doMergeSort(0, arr.length - 1);
    }

    void doMergeSort(int LowerIndex, int HigherIndex) {

        if (LowerIndex < HigherIndex) {
            int middle = LowerIndex + (HigherIndex - LowerIndex) / 2;
            doMergeSort(LowerIndex, middle); //ex.(1-5)
            doMergeSort(middle + 1, HigherIndex);//ex.(6,10)
            MergePart(LowerIndex, middle, HigherIndex);
        }


    }

    // merge small problems and sort
    void MergePart(int LowerIndex, int middle, int HigherIndex) {
        for (int i = LowerIndex; i <= HigherIndex; i++)
            TempArray[i] = array[i];
        int i = LowerIndex;
        int j = middle + 1;
        int k = LowerIndex;
        while (i <= middle && j <= HigherIndex) {
            if (TempArray[i] <= TempArray[j]) {
                array[k] = TempArray[i];
                i++;
            } else {
                array[k] = TempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = TempArray[i];
            k++;
            i++;
        }
    }


    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }

}
