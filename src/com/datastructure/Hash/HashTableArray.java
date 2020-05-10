package com.datastructure.Hash;

//stores data that has been hashed
public class HashTableArray<T> {

    Entry[] arrayHash;
    int size;

    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[size];
        //initilize all element in array hash based on size passed
        for (int i = 0; i < size; i++)
            //create entry and sets all to null
            arrayHash[i] = new Entry();
    }

    int GetHash(int key) {
        //create hash key
        return key % size;
    }

    public void put(int key, Object value) {
        //get hash key
        int HashIndex = GetHash(key);
        //array Hash's index for exiting
        Entry ArrayValue = arrayHash[HashIndex];
        //add new entry
        Entry newItem = new Entry(key, value);
        //set next to item
        newItem.setNext(ArrayValue.next);
        ArrayValue.next = newItem;
    }

    public T get(int key) {
        T value = null;
        int HashIndex = GetHash(key);
        Entry ArrayValue = arrayHash[HashIndex];
        while (ArrayValue != null) {
            if (ArrayValue.GetKey() == key) {
                value = (T) ArrayValue.GetValue();
                break;
            }
            ArrayValue = ArrayValue.next;
        }

        return value;
    }
}
