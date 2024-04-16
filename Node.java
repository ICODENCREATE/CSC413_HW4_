package com.company;

// Node class represents a node in a binary tree
class Node {
    // Key value stored in the node
    int key;
    // References to left child and right child nodes
    Node left, right;

    // Constructor to initialize a node with a given key
    public Node(int item){
        // Set the key of the node to the provided item
        key = item;
        // Initialize left and right child nodes as null
        left = right = null;
    }
}
