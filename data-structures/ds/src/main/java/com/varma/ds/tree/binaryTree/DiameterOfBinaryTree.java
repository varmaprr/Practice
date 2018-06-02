package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 6/2/2018.
 */
public class DiameterOfBinaryTree {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(diameterOfTree(root));
    }

    private static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int lheight = heightOfATree(root.left);
        int rheight = heightOfATree(root.right);

        int lDiameter = diameterOfTree(root.left);
        int rDiameter = diameterOfTree(root.right);

        return Math.max(lheight + rheight + 1, Math.max(lDiameter, rDiameter));
    }

    private static int heightOfATree(Node node) {
        if (node == null)
            return 0;

        return 1 + Math.max(heightOfATree(node.left), heightOfATree(node.right));
    }
}
