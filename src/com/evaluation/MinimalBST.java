package com.evaluation;

import java.util.ArrayList;
import java.util.List;

import com.util.LinkedList;

public class MinimalBST {

    public static void main(String[] args) {
        new MinimalBST().go();
    }

    private void go() {
        TreeNode treeNode = minimalBst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16});
        System.out.println(treeNode);

        System.out.println(isBST(treeNode));

        System.out.println(treeNode.getDepth());

        System.out.println(isBalanced(treeNode));

        treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.setRight(treeNode1);
        treeNode1.setRight(treeNode2);
        System.out.println(isBalanced(treeNode));

        //LinkedList<TreeNode> linkedList = getNodesAt(treeNode, 1);
    }

    private boolean isBST(TreeNode treeNode) {
        return isBST(treeNode, null, null);
    }

    private boolean isBST(TreeNode treeNode, Integer min, Integer max) {
        if(treeNode == null) {
            return true;
        }

        if((min != null && treeNode.value <= min) || (max != null && treeNode.value > max)) {
            return false;
        }

        if(!isBST(treeNode.right, min, treeNode.value) || !isBST(treeNode.left, treeNode.value, max)) {
            return false;
        }

        return true;
    }

    private boolean isBalanced(TreeNode treeNode) {
        int right = treeNode.right == null? 0 : treeNode.right.getDepth();
        int left = treeNode.left == null? 0 : treeNode.left.getDepth();

        return Math.abs(right - left) <= 1;
    }

    private static LinkedList<TreeNode> getNodesAt(TreeNode treeNode, int i) {
        List<LinkedList<TreeNode>> lists = getLinkedLists(treeNode);
        return lists.get(i);
    }

    private static List<LinkedList<TreeNode>> getLinkedLists(TreeNode treeNode) {
        List<LinkedList<TreeNode>> lists = new ArrayList<>();
        getNodesAt(treeNode, lists, 0);
        return lists;
    }

    private static void getNodesAt(TreeNode treeNode, List<LinkedList<TreeNode>> lists, int level) {
        if(treeNode == null) {
            return;
        }

        LinkedList<TreeNode> list = null;
        if(level == lists.size()) {
            list = new LinkedList<>(null);
            lists.add(list);
        }
        else {
            list = lists.get(level);
        }
        list.add(new LinkedList.LinkedListNode<>(treeNode));
        getNodesAt(treeNode.right, lists, level + 1);
        getNodesAt(treeNode.left, lists, level + 1);
    }

    private TreeNode minimalBst(int[] ints) {
        TreeNode treeNode = minimalBst(ints, 0, ints.length - 1);
        return treeNode;
    }

    private TreeNode minimalBst(int[] ints, int start, int end) {
        if(end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(ints[mid]);
        node.setLeft(minimalBst(ints, start, mid - 1));
        node.setRight(minimalBst(ints, mid + 1, end  ));

        return node;
    }

    private static class TreeNode {
        private int value;
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int value) {
            this.value = value;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        /*
        @Override
        public String toString() {

            StringBuilder sb = new StringBuilder();

            List<LinkedList<TreeNode>> linkedLists = getLinkedLists(this);

            int depth = linkedLists.size();

            for (int i = 0; i < linkedLists.size(); i++) {
                int spaces = depth * (3 - i);
                int dashes = i * 3 * depth;

                LinkedList<TreeNode> levelList = linkedLists.get(i);

                String spacesStr = getRepetition(spaces, ' ');
                sb.append(spacesStr);
                LinkedList.LinkedListIterator<TreeNode> iterator = levelList.iterator();

                int c = 1;

                while (iterator.hasNext()) {
                    sb.append(iterator.next().getObject());
                    sb.append(" ");
                    sb.append(getRepetition(dashes, '-'));
                    sb.append(" ");
                    if((c = c % 2) == 0) {
                        sb.append(getRepetition((dashes * 2) - 1, ' '));
                    }
                }

                sb.append("\n");
            }

            return sb.toString();
        }*/

        private String getRepetition(int n, char s) {
            StringBuilder sb = new StringBuilder(n);
            for (int i = 1; i <= n; i++) {
                sb.append(s);
            }
            return sb.toString();
        }

        public int getDepth() {
            return getDepth(this);
        }

        private int getDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }

            return Math.max(1 + getDepth(node.left), 1 + getDepth(node.right));
        }
    }
}
