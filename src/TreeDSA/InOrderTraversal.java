package TreeDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class InOrderTraversal {  // Iterative Time Complexity: O(N) , Space Complexity: O(N)
    static ArrayList<Integer> inOrderTraversal (Node cur){
        ArrayList < Integer > inOrder = new ArrayList < > ();
        Stack< Node > s = new Stack<>();

        while (true){
            if (cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            else{
                if (s.isEmpty()) break;
                cur = s.peek();
                inOrder.add(cur.data);
                s.pop();
                cur = cur.right;
            }
        }
        return inOrder;
    }

    static void inOrderTraversalRec(Node curr, ArrayList < Integer > inOrder) {
        if (curr == null)
            return;

        inOrderTraversalRec(curr.left, inOrder);
        inOrder.add(curr.data);
        inOrderTraversalRec(curr.right, inOrder);
    }

    public static void main(String[] args) {

        ArrayList < Integer > inOrder = new ArrayList < > ();

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
        inOrderTraversalRec(root,inOrder);
    }
}
