package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 4/11/2018.
 */

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PrintBoundaries {

    Node root;

    public static void printBoundaries(Node node) {

        if (node != null) {
            System.out.println(node.data + " ");

            printBoundariesLeft(node.left);

            printLeaves(node.left);
            printLeaves(node.right);

            printBoundariesRight(node.right);

        }
    }

    private static void printLeaves(Node node) {
        if (node != null) {
            printLeaves(node.left);
            if (node.left == null && node.right == null)
                System.out.println(node.data + " ");
            printLeaves(node.right);
        }


    }

    private static void printBoundariesLeft(Node node) {
        if (node != null) {
            if (node.left != null) {
                System.out.println(node.data + " ");
                printBoundariesLeft(node.left);
            } else if (node.right != null) {
                System.out.println(node.data + " ");
                printBoundariesLeft(node.right);
            }
        }
    }

    private static void printBoundariesRight(Node node) {
        if (node != null) {
            if (node.right != null) {
                printBoundariesRight(node.right);
                System.out.println(node.data + " ");
            } else if (node.right != null) {
                printBoundariesRight(node.right);
                System.out.println(node.data + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintBoundaries printBoundaries = new PrintBoundaries();
        printBoundaries.root = new Node(20);
        printBoundaries.root.left = new Node(8);
        printBoundaries.root.left.left = new Node(4);
        printBoundaries.root.left.right = new Node(12);
        printBoundaries.root.left.right.left = new Node(10);
        printBoundaries.root.left.right.right = new Node(14);
        printBoundaries.root.right = new Node(22);
        printBoundaries.root.right.right = new Node(25);

        printBoundaries(printBoundaries.root);
    }

}
