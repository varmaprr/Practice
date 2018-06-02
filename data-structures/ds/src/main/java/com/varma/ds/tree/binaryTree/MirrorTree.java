package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 6/2/2018.
 */

public class MirrorTree {

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

        mirrorOfATree(root);
    }

    private static Node mirrorOfATree(Node root) {

        if(root == null)
            return null;

        Node left = mirrorOfATree(root.left);
        Node right = mirrorOfATree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

}
