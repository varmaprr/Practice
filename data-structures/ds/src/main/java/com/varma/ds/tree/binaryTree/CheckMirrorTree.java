package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 4/11/2018.
 * https://www.geeksforgeeks.org/check-if-two-trees-are-mirror/
 */
public class CheckMirrorTree {

    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
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

        public Node insert(Node root, int data) {

            Node newNode = new Node(data);

            if (root == null)
                return newNode;

            if (data < root.data)
                root.setLeft(insert(root.getLeft(), data));
            else if(data > root.data)
            root.setRight(insert(root.getRight(), data));

            return root;
        }
    }


    public static void main(String[] args) {

        BTree a = new BTree(), b = new BTree();

        Node root1 = a.insert(null, 1);
        root1 = a.insert(root1, 3);
        root1 = a.insert(root1, 4);
        root1 = a.insert(root1, 5);
        root1 = a.insert(root1, 7);

        Node root2 = b.insert(null, 1);
        root2 = b.insert(root2, 3);
        root2 = b.insert(root2, 4);
        root2 = b.insert(root2, 5);
        root2 = b.insert(root2, 7);

        System.out.println(checkMirror(root1, root2));
    }

    private static boolean checkMirror(Node root1, Node root2) {

        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        return root1.getData() == root2.getData() &&
                checkMirror(root1.getLeft(), root2.getRight()) &&
                checkMirror(root1.getRight(), root1.getLeft());
    }
}
