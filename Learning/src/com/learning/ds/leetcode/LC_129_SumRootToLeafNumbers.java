package com.learning.ds.leetcode;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class LC_129_SumRootToLeafNumbers {
    public static void main(String[] args) {
        TreeNode<Integer> node = createTree();
        AtomicInteger finalSum = new AtomicInteger(0);
        findSum(node, 0, finalSum);
        System.out.println(finalSum);
    }

    private static void findSum(TreeNode<Integer> node, int workingSum, AtomicInteger finalSum) {
        if(node == null)
            return;

        if(node.left == null && node.right == null) {
            finalSum.addAndGet(node.value + workingSum * 10);
            return;
        }

        findSum(node.left, workingSum * 10 + node.value, finalSum);
        findSum(node.right, workingSum * 10 + node.value, finalSum);
    }
    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);


        return root;
    }
}
