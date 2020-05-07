package com.datastructure.OneDimensionArray;

public class OneDimensionArray {
    //Arrays
    public static void main(String[] args) {

        //create array size of 5
        int[] numbers = new int[5];
        numbers[0] = 20;
        numbers[1] = 5;
        numbers[2] = 10;
        numbers[3] = 6;
        numbers[4] = 11;


        //print array
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }

        //array of student objects
        Student[] students = new Student[4];
        students[0] = new Student("Mike", 27);
        students[1] = new Student("Chris", 9);
        students[2] = new Student("Tim", 3);
        students[3] = new Student("Rob", 30);

        //print array of students
        for (Student student : students) {
            System.out.println("name : " + student.getName() +
                    ", Age :" + student.getAge());
        }


    }


}
