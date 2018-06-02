package com.varma.ds.tree.binaryTree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by varma on 4/11/2018.
 */


public class PrintTopViewOfTree {

    Node root;

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        System.out.println("Following are nodes in top view of Binary Tree");
        printTopView(root);
    }

    public static void printTopView(Node root) {

        if (root == null)
            return;

        HashSet<Integer> set = new HashSet<>();

        Queue<QItem> qItems = new LinkedList<>();
        qItems.add(new QItem(root, 0));

        while (!qItems.isEmpty()) {
            QItem qi = qItems.remove();
            int hd = qi.hd;
            Node n = qi.node;

            if (!set.contains(hd)) {
                set.add(hd);
                System.out.println(n.data + " ");
            }

            if (n.left != null)
                qItems.add(new QItem(n.left, hd - 1));
            if (n.right != null)
                qItems.add(new QItem(n.right, hd + 1));
        }
    }

}

class QItem {
    Node node;
    int hd;

    public QItem(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}