package com.collections;

import java.util.ArrayList;

public class MyArrayList {

    public static void main(String[] args) {
        //arraylist of names
        ArrayList<String> arl = new ArrayList<String>();
        arl.add("Tim");
        arl.add("Moss");
        arl.add("Chris");
        arl.add("Mike");
        //remove element by index
        arl.remove(2);
        //print elements
        for (String str : arl) {
            System.out.println(str);

        }

        //Arraylist of Class
        ArrayList<Employee> emp = new ArrayList<Employee>();

        //add new employee to arraylist
        emp.add(new Employee("Mikey", 45));
        emp.add(new Employee("Jim", 12));
        emp.add(new Employee("Tom", 4));
        emp.add(new Employee("Reddington", 50));

        //print elements
        for (Employee employee : emp) {
            System.out.println(employee.toString());

        }

    }

    static class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
