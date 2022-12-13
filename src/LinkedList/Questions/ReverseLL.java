package LinkedList.Questions;

import org.w3c.dom.Node;

import java.util.Arrays;

public class ReverseLL {

    Node head;

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node reverseIteratively(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr.next != null) {
            Node temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public Node reverseRecursively(Node head) {
        if (head == null || head.next == null) return head;

        Node newHead = reverseRecursively(head.next);

        Node temp = head.next;
        temp.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);


        Node head = one;
        one.next = two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;

        ReverseLL rl = new ReverseLL();

//        System.out.print(rl.reverseIteratively(head));
        System.out.println();
        rl.reverseRecursively(head);
//        System.out.print(rl.reverseRecursively(head));
    }
}
