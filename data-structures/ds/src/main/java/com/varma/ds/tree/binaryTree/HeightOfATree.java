package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 6/2/2018.
 */
public class HeightOfATree {

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(heightOfATree(root));
    }

    private static int heightOfATree(Node root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(heightOfATree(root.left), heightOfATree(root.right));

    }
}
