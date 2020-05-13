package com.search.LinearSearch;

import com.search.DataSet;

public class LinearSearch {


    public void runSearch(DataSet data, int search) {
        System.out.println("Linear search: Find " + search);
        Boolean IsFound = false;

        //start time
        long startTime = System.nanoTime();

        for (int i = 0; i < data.getSize(); i++) {
            //increment after each loop
            data.numberOfTries++;
            //check if value is found
            if (data.data[i] == search) {
                System.out.println(search + " is found after "
                        + data.numberOfTries + " tries");
                IsFound = true;

                break;
            }
        }

        if (IsFound == false) {
            System.out.println("number not found");
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

    }
}