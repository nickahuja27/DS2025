package com.learning.ds.leetcode;

import com.learning.ds.TreeNode;

public class LC_536_CreateTreeFromString {
    static int index = 0;

    public static void main(String[] args) {
        String inString = "4(2(3)(1))(6(5))";
        TreeNode root = createTree(inString);
        printTree(root);
    }

    private static TreeNode createTree(String inString) {
        if(index >= inString.length())
            return null;

        TreeNode tempNode = new TreeNode(Character.getNumericValue(inString.charAt(index)));

        TreeNode leftNode = null;
        TreeNode rightNode = null;
        if(index < inString.length() - 1 && inString.charAt(index + 1) == '(') {
            index += 2;
            leftNode = createTree(inString);
        }

        if(index < inString.length() - 1 && inString.charAt(index + 1) == '(') {
            index += 2;
            rightNode = createTree(inString);
        }

        if(index < inString.length() - 1 && inString.charAt(index + 1) == ')') {
            index++;
        }

        if(leftNode != null)
            tempNode.left = leftNode;
        if(rightNode != null)
            tempNode.right = rightNode;

        return tempNode;
    }

    private static void printTree(TreeNode node) {
        if(node == null)
            return;
        System.out.println(" " + node.value);
        printTree(node.left);
        printTree(node.right);
    }
}
