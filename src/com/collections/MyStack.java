package com.collections;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {

        Stack<String> st= new Stack<String>();
        st.push("Admins");
        st.push("Manager");
        st.push("Tester");
        st.push("Developer");
        st.push("Business Analyst");
        st.push("Ceo");
        st.push("Boss");

        System.out.println(st.pop());

        System.out.println(st + " Stack");

    }

}
