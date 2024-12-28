package GFG;

public class MoveLastElementToFront {
    static Node head;

    static void moveToFront() {
        if (head == null || head.next == null)
            return;

        /* Initialize second last and last pointers */
        Node secLast = null;
        Node last = head;

        /* After this loop secLast contains address of
           second last  node and last contains address of
           last node in Linked List */
        while (last.next != null) {
            secLast = last;
            last = last.next;
        }

        /* Set the next of second last as null */
        secLast.next = null;

        /* Set the next of last as head */
        last.next = head;

        /* Change head to point to last node. */
        head = last;
    }

    static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        push(5);
        push(4);
        push(3);
        push(2);
        push(1);

        System.out.println(
                "Linked List before moving last to front ");
        printList();

        moveToFront();

        System.out.println(
                "Linked List after moving last to front ");
        printList();
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
