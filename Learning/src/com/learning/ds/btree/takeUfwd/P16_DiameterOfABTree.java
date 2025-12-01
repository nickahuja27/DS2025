package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

public class P16_DiameterOfABTree {
    private static int diameter = Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        findDiameter(root);
        System.out.println("Diameter is : " + diameter);

    }

    private static int findDiameter(TreeNode<Integer> node) {
        if(node == null) return 0;
        int leftHeight = findDiameter(node.left);
        int rightHeight = findDiameter(node.right);
        diameter = Math.max(diameter, 1 + leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(4);

        root.left = new TreeNode<Integer>(7);


        root.right = new TreeNode<Integer>(8);
        root.right.left = new TreeNode<Integer>(1);
        root.right.left.left = new TreeNode<Integer>(3);
        root.right.left.left.left = new TreeNode<Integer>(5);

        root.right.right = new TreeNode<Integer>(0);
        root.right.right.left = new TreeNode<Integer>(2);
        root.right.right.left.left = new TreeNode<Integer>(11);
        root.right.right.right = new TreeNode<Integer>(12);


        return root;
    }
}
