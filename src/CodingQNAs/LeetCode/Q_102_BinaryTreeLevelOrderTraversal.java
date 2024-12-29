package CodingQNAs.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Q_102_BinaryTreeLevelOrderTraversal {
    private TreeNode root;

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> ls = new ArrayList<>();
            int s = q.size();

            for (int i = 0; i < s; i++) {
                TreeNode node = q.remove();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                ls.add(node.val);
            }
            ans.add(ls);
        }
        return ans;
    }

    public static List<List<Integer>> levelOrderApproach2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) {
            return ans;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int s = q.size();
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                ls.add(q.remove().val);
            }
            ans.add(ls);
        }
        return ans;
    }

    public static void levelOrderVoid(TreeNode root) {

        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int s = queue.size();

            for (int i = 0; i < s; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                System.out.print(node.val + " ");
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(levelOrder(root));
        System.out.println(levelOrderApproach2(root));
        levelOrderVoid(root);
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
