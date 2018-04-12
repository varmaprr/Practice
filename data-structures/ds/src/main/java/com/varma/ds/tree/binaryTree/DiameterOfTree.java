package com.varma.ds.tree.binaryTree;

/**
 * Created by varma on 4/11/2018.
 */
public class DiameterOfTree {

    Node root;

    public static void main(String[] args) {

        DiameterOfTree tree = new DiameterOfTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Diameter " + tree.diameter(tree.root));


    }

    private int diameter(Node node) {

        if (node == null)
            return 0;

        int ans = Integer.MIN_VALUE;
        int heig = height(node, ans);

        return ans;
    }

    private int height(Node node, int ans) {

        if (node == null)
            return 0;

        int left = height(node.left, ans);
        int right = height(node.right, ans);

        ans = Math.max(ans, left + right + 1);

        return 1 + Math.max(left, right);
    }

}
