package com.learning.ds.leetcode;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.Stack;

public class LC_103_BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode<Integer> root = null;
        printZigZag(root);
    }

    private static void printZigZag(TreeNode<Integer> node) {
        Stack<TreeNode<Integer>> leftToRightStack = new Stack<>();
        Stack<TreeNode<Integer>> rightToLeftStack = new Stack<>();
        leftToRightStack.push(node);

        while (!leftToRightStack.isEmpty() || !rightToLeftStack.isEmpty()) {
            while (!leftToRightStack.isEmpty()) {
                TreeNode<Integer> poppedNode = leftToRightStack.pop();
                System.out.print(" " + poppedNode.value);
                if(poppedNode.left != null) {
                    rightToLeftStack.push(poppedNode.left);
                }
                if(poppedNode.right != null) {
                    rightToLeftStack.push(poppedNode.right);
                }
            }

            while (!rightToLeftStack.isEmpty()) {
                TreeNode<Integer> poppedNode = rightToLeftStack.pop();
                System.out.print(" " + poppedNode.value);
                if(poppedNode.right != null) {
                    leftToRightStack.push(poppedNode.right);
                }
                if(poppedNode.left != null) {
                    leftToRightStack.push(poppedNode.left);
                }
            }
        }

    }
}
