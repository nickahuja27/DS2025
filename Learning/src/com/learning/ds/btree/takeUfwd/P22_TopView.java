package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

import java.util.Map;
import java.util.TreeMap;

public class P22_TopView {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        Map<Integer, Integer> viewMap = new TreeMap<>();
        printTopView(root, viewMap, 0);
        System.out.println(viewMap);
    }

    private static void printTopView(TreeNode<Integer> node,
                                     Map<Integer, Integer> viewMap,
                                     int counter) {
        if(node == null) return;
        viewMap.putIfAbsent(counter, node.value);
        printTopView(node.left, viewMap, counter - 1);
        printTopView(node.right, viewMap, counter + 1);
    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        root.left = new TreeNode<Integer>(2);
        root.left.left = new TreeNode<Integer>(4);
        root.left.right = new TreeNode<Integer>(5);
        root.left.right.left = new TreeNode<Integer>(6);

        root.right = new TreeNode<Integer>(3);
        root.right.right = new TreeNode<Integer>(7);

        return root;
    }
}
