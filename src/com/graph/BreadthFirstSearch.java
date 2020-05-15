package com.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    int size;
    AdjacentList[] array;


    public BreadthFirstSearch(int size) {
        this.size = size;
        array = new AdjacentList[this.size];

        for (int i = 0; i < size; i++) {
            array[i] = new AdjacentList();
            array[i].head = null;
        }
    }

    public void add(int src, int dest) {

        Node n = new Node(dest, null);
        n.next = array[src].head;
        array[src].head = n;
    }

    public void BFSExplore(int StartVertex) {
        Boolean[] visited = new Boolean[size];

        for (int i = 0; i < size; i++)
            visited[i] = false;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(StartVertex);

        while (!q.isEmpty()) {
            int n = q.poll();
            System.out.println("Visted node: " + n);
            visited[n] = true;
            Node head = array[n].head;

            while (head != null) {
                if (visited[head.value] == false) {
                    q.add(head.value);
                    visited[head.value] = true;
                } else {
                    head = head.next;
                }
            }

        }
    }
}
