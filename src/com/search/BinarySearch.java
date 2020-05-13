package com.search;

public class BinarySearch {

    public void runSearch(DataSet data, int search) {
        System.out.println("Binary search: Find " + search);

        Boolean IsFound = false;

        //start time
        long startTime = System.nanoTime();


        int low = 0; //beginning of data
        int high = data.getSize() - 1; //last element in dataset
        int mid = 0; //middle of data


        while (!IsFound) {
            if (low > high ) {
                System.out.println("number is not found");
                break;
            }

            mid = low + ((high - low) / 2);
            data.numberOfTries++;

            //check if item in dataset is == searched item
            if (data.data[mid] == search) {
                System.out.println(search + " is found after " +
                        data.numberOfTries + " tries");


                break;
            }

            //check if item in dataset is < than searched item then change mid
            //low will keep getin incremented until it its passed high
            if (data.data[mid] < search)
                low = mid + 1;
            //check if item in dataset is > than searched item then change mid
            //high will keep getin incremented until it its passed low
            if (data.data[mid] > search)
                high = mid - 1;

        }

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

    }
}
