package com.learning.ds.leetcode;

import com.learning.ds.TreeNode;

public class LC_111_MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        int depth = findDepth(root);
        System.out.println(depth);
    }

    private static int findDepth(TreeNode<Integer> node) {
        if(node == null)
            return 0;
        return 1 + Math.min(findDepth(node.left), findDepth(node.right));
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
