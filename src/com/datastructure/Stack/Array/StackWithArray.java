package com.datastructure.Stack.Array;

public class StackWithArray<T> {
    Object[] ArrayStack;
    int size; //size of array
    int top;

    public StackWithArray(int size) {
        this.size = size;
        ArrayStack = new Object[this.size];
        top = -1; // pointer outside stack

    }

    public void push(Object newItem) {
        //check if stack is full
        if (isFull()) {
            System.out.println("stack is full " + newItem + " Was not added");
            return;
        }
        top = top + 1; //increment
        ArrayStack[top] = newItem; //set new item to stack
    }

    public Boolean isFull() {

        return (top == size - 1);
    }

    public T pop() {

        if (isEmplty()) {
            System.out.println("stack is empty");
            return null;
        }
        //get item from top of stack
        T item = (T) ArrayStack[top];

        top = top - 1; //decrement top due to removed item

        return item;

    }

    public Boolean isEmplty() {
        return (top == -1);
    }

}
