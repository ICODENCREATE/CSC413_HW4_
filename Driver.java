package com.company;

public class Driver {

    public static void main(String[] args) {
        BST bst = new BST();

        // Insert elements into the BST
        bst.insert(50);
        bst.insert(20);
        bst.insert(60);
        bst.insert(30);
        bst.insert(40);
        bst.insert(70);
        bst.insert(80);

        // Perform inorder traversal
        System.out.println("Inorder traversal:");
        bst.inorder();
        System.out.println();
        System.out.println();


        // Perform preorder traversal
        System.out.println("Preorder traversal:");
        bst.preorder();
        System.out.println();
        System.out.println();


        // Perform postorder traversal
        System.out.println("Postorder traversal:");
        bst.postorder();
        System.out.println();
        System.out.println();


        // Search for elements in the BST
        System.out.println("Searching for 30: " + bst.searchElement(30));
        System.out.println("Searching for 1200: " + bst.searchElement(1200));
        System.out.println();


        // Delete elements from the BST
        System.out.println("Deleting 40 from the BST...");
        bst.delete(40);
        System.out.println("Inorder traversal after deletion:");
        bst.inorder();
        System.out.println();

    }
}
