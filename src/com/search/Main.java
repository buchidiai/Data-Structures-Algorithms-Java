package com.search;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //new dataset created
        DataSet data_set_1 = new DataSet(1000000);
        DataSet data_set_2 = new DataSet(1000000);
        DataSet data_set_3 = new DataSet(1000000);

        //random num generator
        Random rand = new Random();

        //value to search
        final int Search = rand.nextInt(999999);


        LinearSearch ls = new LinearSearch();
        BinarySearch bs = new BinarySearch();
        InterpolationSearch is = new InterpolationSearch();


        ls.runSearch(data_set_1, Search);
        System.out.println("*************");
        bs.runSearch(data_set_2, Search);
        System.out.println("*************");
        bs.runSearch(data_set_3, Search);
        System.out.println("*************");
    }

//    Linear search: Find 139084
//    139084 is found after 139084 tries
//    Execution time in milliseconds : 44
//            *************
//    Binary search: Find 473448
//    number is found after 20 tries
//    Execution time in milliseconds : 7
}
