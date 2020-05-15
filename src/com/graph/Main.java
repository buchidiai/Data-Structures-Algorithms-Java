package com.graph;

public class Main {

    public static void main(String[] args) {


        BreadthFirstSearch bfs = new BreadthFirstSearch(6);

        bfs.add(0, 2);
        bfs.add(0, 1);
        bfs.add(1, 4);
        bfs.add(1, 3);
        bfs.add(1, 0);
        bfs.add(3, 1);
        bfs.add(4, 1);
        bfs.add(2, 5);
        bfs.add(2, 0);
        bfs.add(5, 2);
        bfs.BFSExplore(0);

        System.out.println("********************************");


        DepthFirstSearch dfs = new DepthFirstSearch(6);


        dfs.add(0, 2);
        dfs.add(0, 1);
        dfs.add(1, 4);
        dfs.add(1, 3);
        dfs.add(1, 0);
        dfs.add(3, 1);
        dfs.add(4, 1);
        dfs.add(2, 5);
        dfs.add(2, 0);
        dfs.add(5, 2);
        dfs.DFSExplore(0);
    }
}
