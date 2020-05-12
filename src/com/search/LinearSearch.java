package com.search;

import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        //new dataset created
        DataSet data = new DataSet(1000000);
        //random num generator
        Random rand = new Random();
        //value to search
        int Search = rand.nextInt(999999);
        //check if value is found
        Boolean IsFound = false;

        System.out.println("Searching for " + Search);
        //start time
        long startTime = System.nanoTime();

        for (int i = 0; i < data.getSize(); i++) {
            //increment after each loop
            data.numberOfTries++;
            //check if value is found
            if (data.data[i] == Search) {
                System.out.println("Element is found after "
                        + data.numberOfTries + "  try");
                IsFound = true;

                break;
            }
        }

        if (IsFound == false) {
            System.out.println("number is not found");
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in nanoseconds  : " + timeElapsed);

        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

    }

    //sample output

//    Searching for 932426
//    Element is found after 932426  try
//    Execution time in nanoseconds  : 57186819
//    Execution time in milliseconds : 57
}