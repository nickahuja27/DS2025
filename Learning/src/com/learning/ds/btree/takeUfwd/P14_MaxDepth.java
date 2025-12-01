package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

public class P14_MaxDepth {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        int maxHeight = getMaxHeight(root);
        System.out.println("Height is: " + maxHeight);
    }

    private static int getMaxHeight(TreeNode<Integer> node) {
        if(node == null)
            return 0;
        int leftHeight = getMaxHeight(node.left);
        int rightHeight = getMaxHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(8);

        root.left = new TreeNode<Integer>(4);
        root.left.left = new TreeNode<Integer>(2);
        root.left.left.left = new TreeNode<Integer>(1);
        root.left.left.right = new TreeNode<Integer>(3);

        root.left.right = new TreeNode<Integer>(6);
        root.left.right.left = new TreeNode<Integer>(5);
        root.left.right.right = new TreeNode<Integer>(7);

        root.right = new TreeNode<Integer>(11);
        root.right.left = new TreeNode<Integer>(9);
        root.right.left.right = new TreeNode<Integer>(10);

        root.right.right = new TreeNode<Integer>(13);
        root.right.right.left = new TreeNode<Integer>(12);
        root.right.right.right = new TreeNode<Integer>(14);
        root.right.right.right.right = new TreeNode<Integer>(15);

        return root;
    }
}
