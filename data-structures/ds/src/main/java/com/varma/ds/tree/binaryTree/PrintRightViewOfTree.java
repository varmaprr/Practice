package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 4/11/2018.
 */

public class PrintRightViewOfTree {

    Node root;
    Integer maxLevel = 0;

    public static void main(String[] args) {

        PrintRightViewOfTree tree = new PrintRightViewOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);

        tree.rightView();
    }

    private void rightView() {
        rightView(root);
    }

    void rightView(Node root) {
        rightViewUtil(root, 1);
    }

    private void rightViewUtil(Node root, int level) {

        if (root == null)
            return;

        if (maxLevel < level) {
            System.out.println(root.data + " ");
            maxLevel = level;
        }

        rightViewUtil(root.right,level+1);
        rightViewUtil(root.left,level+1);
    }

}
