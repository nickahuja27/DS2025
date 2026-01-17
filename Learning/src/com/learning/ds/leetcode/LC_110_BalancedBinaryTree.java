package com.learning.ds.leetcode;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicBoolean;

public class LC_110_BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        AtomicBoolean balanced = new AtomicBoolean(true);
        isBalanced(root, balanced);
        System.out.println(balanced);
    }

    private static int isBalanced(TreeNode<Integer> node, AtomicBoolean balanced) {
        if(node == null)
            return 0;

        int leftHeight = isBalanced(node.left, balanced);
        int rightHeight = isBalanced(node.right, balanced);
        if(Math.abs(leftHeight - rightHeight) > 1)
            balanced.set(false);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        //root.left.left.left = new TreeNode(6);
        //root.left.left.right = new TreeNode(7);
        return root;
    }
}
