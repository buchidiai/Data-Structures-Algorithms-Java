package com.search;

public class InterpolationSearch {


    public void runSearch(DataSet data, int search) {
        System.out.println("Interpolation search: Find " + search);
        Boolean IsFound = false;


        int low = 0; //beginning of data
        int high = data.getSize() - 1; //last element in dataset
        int mid = 0; //middle of data


        while (!IsFound) {
            if (low > high) {
                System.out.println("number was not found");
                break;
            }

            mid = low + ((high - low) / (data.data[high] - data.data[low])) * (search - data.data[low]);

            data.numberOfTries++;


            if (data.data[mid] == search) {
                System.out.println(search + " was found after " +
                        data.numberOfTries + "tries");
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

    }
}
