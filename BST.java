package com.company;

public class BST {
    // Root node of the BST
    private Node root;

    // Constructor to initialize an empty BST
    public BST() {
        // Initialize root as null (empty tree)
        root = null;
    }

    // Method to insert a key into the BST
    void insert(int key) {
        // Call recursive insert method
        root = insertRecursion(root, key);
    }

    // Recursive method to insert a key into the BST
    Node insertRecursion(Node root, int key) {
        if (root == null) {
            // If tree is empty, create a new node as the root
            root = new Node(key);
            return root;
        } else if (key < root.key)
            // If key is less than current node's key, recursively insert into the left subtree
            root.left = insertRecursion(root.left, key);
        else if (key > root.key)
            // If key is greater than current node's key, recursively insert into the right subtree
            root.right = insertRecursion(root.right, key);

        return root;
    }

    // Method to delete a key from the BST
    void delete(int key) {
        // Call recursive delete method
        root = deleteRecursion(root, key);
    }

    // Recursive method to delete a key from the BST
    Node deleteRecursion(Node root, int key) {
        if (root == null) {
            // If tree is empty or key is not found, return null
            return root;
        }

        // Traverse to find the node with the specified key
        if (root.key > key) {
            // Recursively delete from left subtree
            root.left = deleteRecursion(root.left, key);
            return root;
        } else if (root.key < key) {
            // Recursively delete from right subtree
            root.right = deleteRecursion(root.right, key);
            return root;
        }
        else {
            // Node with the key to be deleted is found
            if (root.left == null) {
                // If node has no left child, replace it with its right child
                Node temp = root.right;
                return temp;
            } else if (root.right == null) {
                // If node has no right child, replace it with its left child
                Node temp = root.left;
                return temp;
            } else {
                // Node has both left and right children
                // Find the inorder successful and the smallest node in right subtree)
                Node successful = root.right;
                while (successful.left != null) {
                    successful = successful.left;
                }
                // Replace node's key with successful's key
                root.key = successful.key;
                // Delete the successful node
                root.right = deleteRecursion(root.right, root.key);
            }
        }
        return root;
    }
    // Method to search for a key in the BST
    public boolean searchElement(int key) {
        // Call recursive search method
        Node result = searchRecursion(root, key);
        // Return true if key is found, false otherwise
        return result != null;
    }
    // Recursive method to search for a key in the BST
    private static Node searchRecursion(Node root, int key) {
        if (root == null || root.key == key) {
            // Return current node if key is found or tree is empty
            return root;
        }

        if (key > root.key) {
            // Recursively search in right subtree
            return searchRecursion(root.right, key);
        } else {
            // Recursively search in left subtree
            return searchRecursion(root.left, key);
        }
    }
    // Method to perform inorder traversal of the BST
    public void inorder() {
        // Call recursive inorder traversal method
        inorderRecursion(root);
    }
    // Recursive method for inorder traversal of the BST
    private void inorderRecursion(Node root) {
        if (root == null)
            return;

        // Traverse left subtree
        inorderRecursion(root.left);
        // Visit current node
        System.out.print(root.key + " ");
        // Traverse right subtree
        inorderRecursion(root.right);
    }

    // Method to perform preorder traversal of the BST
    public void preorder() {
        // Call recursive preorder traversal method
        preorderRecursion(root);
    }

    // Recursive method for preorder traversal of the BST
    private void preorderRecursion(Node root){
        if (root == null)
            return;

        // Visit current node
        System.out.print(root.key + " ");
        // Traverse left subtree
        preorderRecursion(root.left);
        // Traverse right subtree
        preorderRecursion(root.right);
    }

    // Method to perform postorder traversal of the BST
    void postorder(){
        // Call recursive postorder traversal method
        postorderRecursion(root);
    }

    // Recursive method for postorder traversal of the BST
    private void postorderRecursion(Node root) {
        if (root == null)
            return;
        // Traverse left subtree
        postorderRecursion(root.left);
        // Traverse right subtree
        postorderRecursion(root.right);
        // Visit current node
        System.out.print(root.key + " ");
    }

}




