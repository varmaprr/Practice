package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 4/12/2018.
 */
public class MaxInTree {

    static Node root;

    public static void main(String[] args) {

        root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);

        System.out.println(findMax(root));
    }

    private static int findMax(Node node) {
        int max = Integer.MIN_VALUE;

        if (node != null) {
            int val = node.data;

            int left = findMax(node.left);
            int right = findMax(node.right);

            if (left < right)
                max = right;
            else if (left > right)
                max = left;

            if (val > max)
                max = val;
        }

        return max;
    }


}
