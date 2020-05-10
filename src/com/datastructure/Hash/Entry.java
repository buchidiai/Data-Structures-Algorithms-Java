package com.datastructure.Hash;

//Data to be hashed
//contains (key, value)
// contains next pointing to the next item
public class Entry {
    int key;
    Object value;
    Entry next;

    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        next = null;
    }


    public Entry() {
        next = null;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public int GetKey() {
        return key;
    }

    public Object GetValue() {
        return value;
    }
}
