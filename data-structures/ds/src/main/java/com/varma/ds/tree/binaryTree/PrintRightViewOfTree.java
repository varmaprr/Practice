package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 4/11/2018.
 */

class Max_level {
    int max_level;
}

public class PrintRightViewOfTree {

    Node root;
    Max_level max = new Max_level();

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
        rightViewUtil(root, 1, max);
    }

    private void rightViewUtil(Node root, int level, Max_level max) {

        if (root == null)
            return;

        if (max.max_level < level) {
            System.out.println(root.data + " ");
            max.max_level = level;
        }

        rightViewUtil(root.right,level+1,max);
        rightViewUtil(root.left,level+1,max);
    }

}
