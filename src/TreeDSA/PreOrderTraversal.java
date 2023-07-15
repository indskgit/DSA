package TreeDSA;

public class PreOrderTraversal {
    static class Node{
        int value;
        Node right;
        Node left;


        public Node(int key){
            this.value = key;
        } //constructor
    }

    static void preOrderTraversal(Node root){

        if (root == null) return;
        System.out.println("   "+ root.value );
        System.out.println(root.left.value + "   " +"  "+ root.right.value);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);

        preOrderTraversal(root);
    }
}
