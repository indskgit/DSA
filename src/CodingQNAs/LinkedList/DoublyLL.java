package CodingQNAs.LinkedList;

public class DoublyLL {
    Node head;
    private Node tail;

    public void insertionAtFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;
    }


//    public void insertion(int val,int pos){
//        Node node = new Node(val);
//
//        if (head == null){
//            this.head = node;
//            head.prev= null;
////            head.next = null;
//            tail =head;
//            return;
//        }
//
//        Node temp = tail;
//        if (temp == null){
//            node.next = temp.next;
////
//            node.prev = temp;
//            temp.next = node;
//            tail = node;
//            return;
//        }
//
//        Node cur = head;
//        for (int i =0; i<pos-1; i++){
//            cur= cur.next;
//        }
//        node.next =cur.next;
//        node.prev = cur;
//        cur.next = node;
//        cur.next.prev = node;
//    }

    public void insertAtLast(int val) {
        Node node = new Node(val);
        Node temp = head;
        if (head == null) {
            node.prev = null;
            node.next = null;
            head = node;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        node.next = null;
        node.prev = temp;
        temp.next = node;

    }

    public Node findNode(int node) {
        //First Find The After_Node after which node I have to insert if that exists
        Node find_node = head;

        while (find_node != null) {
            if (find_node.value == node) {
                System.out.println("the Node exit  " + find_node);
                return find_node;
            }
            find_node = find_node.next;
        }
        return null;
    }

    void insertAfter(int after, int value) {
        Node node = findNode(after);

        if (node == null) {
            return;
        }

        Node new_node = new Node(value);

        new_node.next = node.next;
        node.next = new_node;
        new_node.prev = node;
        if (new_node.next != null) {
            new_node.next.prev = node;
        }
        return;

    }

    void display() {
        Node temp = head;
        System.out.print("Linked List are :");
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayRev(Node head) {

        if (head == null)
            return;
        displayRev(head.next);

        System.out.print(head.value + "->");

    }

    private class Node {
        Node next;
        Node prev;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
