package com.learning.ds.btree.takeUfwd;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;
import java.util.Stack;

public class P19_ZigZag {
    public static void main(String[] args) {
        TreeNode<Integer> root = BinaryTree.create();
        traverse(root);
    }

    private static void traverse(TreeNode<Integer> node) {
        Stack<TreeNode<Integer>> lStack = new Stack<>();
        Stack<TreeNode<Integer>> rStack = new Stack<>();
        boolean flag = true;
        lStack.push(node);

        while (!lStack.isEmpty() || !rStack.isEmpty()) {
            if(flag) {
                while (!lStack.isEmpty()) {
                    TreeNode<Integer> tempNode = lStack.pop();
                    System.out.print(" " + tempNode.value);
                    if(tempNode.left != null) {
                        rStack.add(tempNode.left);
                    }
                    if(tempNode.right != null) {
                        rStack.add(tempNode.right);
                    }
                }
                flag = !flag;
            }

            if(!flag) {
                while (!rStack.isEmpty()) {
                    TreeNode<Integer> tempNode = rStack.pop();
                    System.out.print(" " + tempNode.value);
                    if(tempNode.right != null) {
                        lStack.add(tempNode.right);
                    }
                    if(tempNode.left != null) {
                        lStack.add(tempNode.left);
                    }
                }
                flag = !flag;
            }
        }
    }
}
