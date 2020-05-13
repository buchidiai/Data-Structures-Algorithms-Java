package com.search;

import com.search.BinarySearch.BinarySearch;
import com.search.LinearSearch.LinearSearch;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //new dataset created
        DataSet data_1 = new DataSet(1000000);
        DataSet data_2 = new DataSet(1000000);

        //random num generator
        Random rand = new Random();

        //value to search
        int Search_1 = rand.nextInt(999999);
        int Search_2 = rand.nextInt(999999);

        LinearSearch ls = new LinearSearch();
        BinarySearch bs = new BinarySearch();


        ls.runSearch(data_1, Search_1);
        System.out.println("*************");
        bs.runSearch(data_2, Search_2);
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
