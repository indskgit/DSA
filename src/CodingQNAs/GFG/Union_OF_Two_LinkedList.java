package CodingQNAs.GFG;

import java.util.Set;
import java.util.TreeSet;

public class Union_OF_Two_LinkedList {
    Node head;

    public static Node findUnion(Node head1, Node head2) {
        Set<Integer> s = new TreeSet<>();
        while (head1 != null) {
            s.add(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            s.add(head2.data);
            head2 = head2.next;
        }
        Node head = null;
        Node temp = head;
        for (Integer i : s) {
            if (head == null) {
                head = new Node(i);
                temp = head;
            } else {
                temp.next = new Node(i);
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

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
