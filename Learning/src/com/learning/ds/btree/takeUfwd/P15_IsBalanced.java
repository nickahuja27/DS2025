package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

public class P15_IsBalanced {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        int isBalanced = isBalanced(root);
        System.out.println("Is Balanced: " + (isBalanced != -1));
    }

    private static int isBalanced(TreeNode<Integer> node) {
        if(node == null) return 0;
        int leftHeight = isBalanced(node.left);
        int rightHeight = isBalanced(node.right);

        if(leftHeight == -1 || rightHeight == -1)
            return -1;

        if(Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(1);

        root.left = new TreeNode<Integer>(2);
        root.left.left = new TreeNode<Integer>(3);


        root.right = new TreeNode<Integer>(4);
        root.right.left = new TreeNode<Integer>(5);
        root.right.left.right = new TreeNode<Integer>(6);

        root.right.right = new TreeNode<Integer>(7);
        root.right.right.right = new TreeNode<Integer>(8);
        root.right.right.right = new TreeNode<Integer>(9);

        return root;
    }
}
