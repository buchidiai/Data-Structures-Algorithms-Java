package com.tree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(bst.root, bst.NodeCreate(10));
        bst.add(bst.root, bst.NodeCreate(12));
        bst.add(bst.root, bst.NodeCreate(16));
        bst.add(bst.root, bst.NodeCreate(13));
        bst.add(bst.root, bst.NodeCreate(6));
        bst.add(bst.root, bst.NodeCreate(5));
        bst.add(bst.root, bst.NodeCreate(9));
        bst.add(bst.root, bst.NodeCreate(85));
        bst.add(bst.root, bst.NodeCreate(37));


        bst.Search(37, bst.root);
    }
}
