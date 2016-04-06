package com.examples.BinaryTreeProblems;

public class BinarySearchTree {
    public BinaryTreeNode root;

    public void insert(int value) {
        BinaryTreeNode node = new BinaryTreeNode(value);
        if (root == null) {
            root = node;
            return;
        }
        insertRec(root, node);
    }

    public void printPreorder() {
        printPreordrRec(root);
        System.out.println("");
    }

    public boolean find(int value) {
        if (root == null) {
            return false;
        }
        return findValue(root, value);

    }

    private boolean findValue(BinaryTreeNode tmpRoot, int value) {
        if (tmpRoot == null)
            return false;
        return (tmpRoot.value == value || findValue(tmpRoot.left, value) || findValue(tmpRoot.right, value));
    }

    private void insertRec(BinaryTreeNode tmproot, BinaryTreeNode node) {
        // TODO Auto-generated method stub
        if (node.value > tmproot.value) {
            if (tmproot.right == null) {
                tmproot.right = node;
                return;
            } else
                insertRec(tmproot.right, node);
        } else {
            if (tmproot.left == null) {
                tmproot.left = node;
                return;
            } else
                insertRec(tmproot.left, node);
        }
    }

    private void printPreordrRec(BinaryTreeNode currRoot) {
        if (currRoot == null) {
            System.out.print("_");
            return;
        }
        System.out.print(currRoot.value + ",");
        printPreordrRec(currRoot.left);
        printPreordrRec(currRoot.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(20);
        bst.insert(15);
        bst.insert(25);
        bst.insert(10);
        bst.insert(18);
        bst.insert(16);
        // bst.insert()
        // bst.insert();
        bst.insert(19);
        bst.printPreorder();
        System.out.println("Value found : " + bst.find(122));
    }

}
