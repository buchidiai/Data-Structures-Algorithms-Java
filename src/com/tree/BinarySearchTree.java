package com.tree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node NodeCreate(int value) {
        return new Node(value, null, null);
    }

    public void add(Node start, Node newNode) {
        //add first node
        //check if root node is null

        if (root == null) {
            root = newNode;
            return;
        }

        //add right node by checking if its greater than parent node
        if (newNode.value > start.value) {

            //check if there isnt already a value there
            if (start.right == null) {

                //assign right node of parent to new Node
                start.right = newNode;

                //add new node to the right of parent root node
                add(start.right, newNode);
            }
        }

        //add left node by checking if its greater than parent node
        if (newNode.value < start.value) {
            //check if there isnt already a value there
            if (start.left == null) {

                //assign left node of parent to new Node
                start.left = newNode;

                //add new node to the right of parent root node
                add(start.left, newNode);
            }
        }
    }

    public void Search(int value, Node start) {

        if (start == null) {
            System.out.println(value + " was not found, parent node value is " + start  );
            return;
        }

        if (start.value == value) {
            System.out.println(value + " was found, parent node value is " + start );
            return;
        }
        if (value > start.value) {
            Search(value, start.right);
        }
        if (value < start.value) {
            Search(value, start.left);
        }
    }
}
