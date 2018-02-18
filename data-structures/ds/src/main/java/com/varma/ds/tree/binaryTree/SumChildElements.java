package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 2/18/2018.
 */
public class SumChildElements {

    static class Node {
        private int value;
        private Node left;
        private Node right;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    static class BTree {

        public Node insert(Node root, int newValue) {

            Node node = new Node();
            node.setValue(newValue);

            if (root == null) {
                root = node;
            }

            if (newValue < root.getValue()) {
                root.setLeft(insert(root.getLeft(), newValue));
            } else if (newValue > root.getValue()) {
                root.setRight(insert(root.getRight(), newValue));
            }

            return root;
        }

        public void displayBSTree(Node node) {

            if (node == null)
                return;

            if (node != null) {
                System.out.print(node.getValue() + " ");
                displayBSTree(node.getLeft());
                displayBSTree(node.getRight());
            }
        }
    }

    public static void main(String[] args) {

        BTree bTree = new BTree();
        Node root = bTree.insert(null, 5);
        root = bTree.insert(root, 2);
        root = bTree.insert(root, 8);
        root = bTree.insert(root, 3);
        root = bTree.insert(root, 7);

        bTree.displayBSTree(root);

        updateParentNodeWithSum(root);

        bTree.displayBSTree(root);

    }

    public static int updateParentNodeWithSum(Node root) {

        if (root == null)
            return 0;

        int currentVal = root.getValue();

        if (root.getLeft() == null && root.getRight() == null) {
            root.setValue(0);
            return currentVal;
        }


        int leftSum = updateParentNodeWithSum(root.getLeft());
        int rightSum = updateParentNodeWithSum(root.getRight());
        root.setValue(leftSum + rightSum);

        return leftSum + rightSum + currentVal;
    }
}
