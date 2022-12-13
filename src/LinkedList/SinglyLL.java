package LinkedList;

public class SinglyLL {

    private Node head;
    private Node tail;//making this tail to avoid o(n) complexity for insertion at last(we don't have to traverse till last)

    public void insertAtFirst(int val) {
        Node node = new Node(val);//creating New Node First

        node.next = head;
        head = node;

        if (tail == null) { //means if there is only one element inside ll
            tail = head;
        }

    }

    void insertAtLast(int val) {
        Node node = new Node(val);

        if (tail == null) {
            System.out.println("the tail is null means no element exit in ll so it will assigned to head");
            insertAtFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
    }

    void insertInBetween(int val, int pos) {
        Node node = new Node(val);

        if (pos == 0) {
            insertAtFirst(val);
        } else {
            Node temp = head;

            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;

                if (temp.next == null) {
                    insertAtLast(val);
                    return;
                }

            }

            node.next = temp.next;
            temp.next = node;

        }

    }

    void insertUsingRecursion(int val, int index) {

    }

    void Deletion(int pos) {
        if (head == null) {
            tail = null;
            System.out.println("ll is empty");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;

            if (temp.next == null) {
                temp.next = temp.next.next;
                return;
            }
        }

        temp.next = temp.next.next;

    }

    void display() {
        Node temp = head;
        System.out.print("Linked List are :");
        while (temp != null) {
            System.out.print(temp.Value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        int Value;
        Node next;

        public Node(int value) {
            Value = value;
        }

//        public Node(int value, Node next) {
//            Value = value;
//            this.next = next;
//        }

    }

}
