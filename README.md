# BST-Implementation

This repository contains a Java implementation of a binary search tree (BST) data structure and some common operations on it.

## Classes

The project consists of three classes:

- **Main**: This class contains the main method that creates a BST object and tests some of the methods on it.
- **TNode**: This class represents a node in a BST, which has a data field, a left child, and a right child. It also has two constructors and a toString method.
- **BST**: This class represents a BST, which has a root node and a size. It also has methods for inserting, searching, traversing, finding the parent, finding the depth, checking if the tree is full, checking if the nodes are at the same level, counting the number of nodes, and checking if two trees are equal.

## Methods

The BST class has the following methods:

- **insertNode**: This method inserts a new node with the given data into the BST. It uses the recursiveInsertNode method to find the correct position for the new node.
- **recursiveInsertNode**: This method recursively finds the correct position for a new node in a subtree rooted at a given node. It returns the updated subtree after insertion.
- **search**: This method searches for a node with the given data in the BST. It uses the recursiveSearch method to find the node or return null if not found.
- **recursiveSearch**: This method recursively searches for a node with the given data in a subtree rooted at a given node. It returns the node if found or null otherwise.
- **DFS**: This method performs a depth-first traversal of the BST and prints the data of each node. It uses the DFS_inorder, DFS_preorder, and DFS_postorder methods to print the nodes in different orders.
- **BFS**: This method performs a breadth-first traversal of the BST and prints the data of each node. It uses a queue to store the nodes at each level and prints them in order.
- **BFS_recursive**: This method performs a recursive breadth-first traversal of the BST and prints the data of each node. It uses a list of lists to store the nodes at each level and prints them in order.
- **DFS_inorder**: This method performs an inorder traversal of a subtree rooted at a given node and prints the data of each node. It visits the left subtree, the root, and the right subtree in order.
- **DFS_preorder**: This method performs a preorder traversal of a subtree rooted at a given node and prints the data of each node. It visits the root, the left subtree, and the right subtree in order.
- **DFS_postorder**: This method performs a postorder traversal of a subtree rooted at a given node and prints the data of each node. It visits the left subtree, the right subtree, and the root in order.
- **Find_parent**: This method finds the parent node of a node with the given data in the BST. It returns the parent node if found or null otherwise.
- **depth_node**: This method finds the depth of a node with the given data in the BST. It returns the depth as an integer if found or -1 otherwise.
- **depth_tree**: This method finds the depth of the BST. It returns the depth as an integer or 0 if the tree is empty.
- **Full_Or_Not_Tree**: This method checks if the BST is a full binary tree, which means that every node has either zero or two children. It returns true if the tree is full or false otherwise.
- **Same_Level**: This method checks if two nodes with the given data are at the same level in the BST. It returns true if they are at the same level or false otherwise.
- **total_number_node**: This method counts the total number of nodes in the BST. It returns the number as an integer or 0 if the tree is empty.
- **check_equal**: This method checks if two BSTs are equal, which means that they have the same structure and data. It returns true if they are equal or false otherwise.

## How to run

To run the project, you need to have Java installed on your system. You can compile the Java files using the command:

`javac Main.java TNode.java BST.java`

You can then run the Main class using the command:

`java Main`

You can modify the main method to test different methods on different BSTs.
