package CodingQNAs.TreeDSA;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeWaysOfTraversal {  // Iterative Time Complexity: O(N) , Space Complexity: O(N)

    static ArrayList<Integer> inOrderTraversal(Node cur) {
        ArrayList<Integer> inOrder = new ArrayList<>();
        Stack<Node> s = new Stack<>();

        while (true) {
            if (cur != null) {
                s.push(cur);
                cur = cur.left;
            } else {
                if (s.isEmpty()) break;
                cur = s.peek();
                inOrder.add(cur.data);
                s.pop();
                cur = cur.right;
            }
        }
        return inOrder;
    }

    static void inorderTraversal(Node cur) {
        if (cur == null) return;
        Stack<Node> st = new Stack<>();
        Node temp = cur;
        while (!st.isEmpty() || temp != null) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                temp = st.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    static void preOrderTraversal(Node cur) {
        Stack<Node> st = new Stack<>();
        if (cur == null) return;
        st.push(cur);
        while (!st.isEmpty()) {
            Node temp = st.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
        }
    }

    static void postOrderTraversal(Node cur) {
        Node temp = cur;
        Stack<Node> st = new Stack<>();
        while (temp != null || !st.isEmpty()) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                Node temp2 = st.peek().right;
                if (temp2 == null) {
                    temp2 = st.pop();
                    System.out.print(temp2.data + " ");
                    while (!st.isEmpty() && temp2 == st.peek().right) {
                        temp2 = st.pop();
                        System.out.print(temp2.data + " ");
                    }
                } else {
                    temp = temp2;
                }
            }
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.println(inOrderTraversal(root));
        System.out.println("\n");
        inorderTraversal(root);
        System.out.println("\n");
        preOrderTraversal(root);
        System.out.println("\n");
        postOrderTraversal(root);

    }

    static class Node {
        int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
