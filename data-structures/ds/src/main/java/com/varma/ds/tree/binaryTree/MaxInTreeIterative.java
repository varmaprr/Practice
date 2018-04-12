package com.varma.ds.tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by varma on 4/12/2018.
 */
public class MaxInTreeIterative {

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

    private static int findMax(Node root) {

        int max = Integer.MIN_VALUE;

        Queue<Node> queue = new LinkedList();

        queue.add(root);

        while(!queue.isEmpty()){

            Node node = queue.remove();

            if(node.left != null)
                queue.add(node.left);

            if(node.right != null)
                queue.add(node.right);

            if(node.data > max){
                max = node.data;
            }
        }

        return max;

    }
}
