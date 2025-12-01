package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

public class P26_RootToNodePath {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        print(root,6, "");
    }

    private static void print(TreeNode<Integer> node, int nodeToFind, String pathSoFar) {
        if(node == null) return;

        pathSoFar += node.value;
        if(node.value == nodeToFind) {
            System.out.println(pathSoFar);
            return;
        }

        print(node.left, nodeToFind, pathSoFar);
        print(node.right, nodeToFind, pathSoFar);
    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        root.left = new TreeNode<Integer>(2);
        root.left.left = new TreeNode<Integer>(4);
        root.left.right = new TreeNode<Integer>(5);
        root.left.right.left = new TreeNode<Integer>(6);

        root.right = new TreeNode<Integer>(3);
        root.right.right = new TreeNode<Integer>(7);

        return root;
    }
}
