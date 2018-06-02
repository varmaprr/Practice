package com.varma.ds.tree.binarySearchTree;

import com.varma.ds.tree.binaryTree.MirrorTree;

/**
 * Created by varma on 6/2/2018.
 */
public class CheckIsBST {

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

    }

    private boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(Node node, int min, int max) {
        if (node == null)
            return true;

        if (node.data < min || node.data > max) {
            return false;
        }

        return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max));
    }


}
