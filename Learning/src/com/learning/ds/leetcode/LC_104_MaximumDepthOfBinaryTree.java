package com.learning.ds.leetcode;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

public class LC_104_MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = null;
        root.left.left.left.left = new TreeNode(0);
        int depth = findDepth(root);
        System.out.println(depth);
    }

    private static int findDepth(TreeNode<Integer> node) {
        if (node == null)
            return 0;

        return 1 + Math.max(findDepth(node.left), findDepth(node.right));
    }
}
