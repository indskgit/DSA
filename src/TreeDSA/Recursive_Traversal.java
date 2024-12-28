package TreeDSA;

public class Recursive_Traversal {

    static void preOrderTraversalRec(Node root) { // Rule:->Root left Right

        if (root == null) return;
        System.out.print(root.value + " ");
        preOrderTraversalRec(root.left);
        preOrderTraversalRec(root.right);

    }

//    public static void createTree(){
//
//        Node root = new Node(9);
//        root.left = new Node(5);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(6);
//    }

    static void inOrderTraversalRec(Node root) { // Rule:->left Root Right
        if (root == null)
            return;
        inOrderTraversalRec(root.left);
        System.out.print(root.value + " ");
        inOrderTraversalRec(root.right);
    }

    static void postOrderTraversalRec(Node root) { //Rule:->left Right Root
        if (root == null) return;
        postOrderTraversalRec(root.left);
        postOrderTraversalRec(root.right);
        System.out.print(root.value + " ");
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

//        createTree();

        preOrderTraversalRec(root);
        System.out.println("\n");
        inOrderTraversalRec(root);
        System.out.println("\n");
        postOrderTraversalRec(root);
    }

    static class Node {
        int value;
        Node right;
        Node left;

        public Node(int key) {
            this.value = key;
        } //constructor
    }
}
