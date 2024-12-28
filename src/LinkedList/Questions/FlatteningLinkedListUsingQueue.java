package LinkedList.Questions;

import java.util.ArrayDeque;
import java.util.Queue;

//Space Comp--O(n) since we are using Queue
//Time Comp--O(n)
public class FlatteningLinkedListUsingQueue {
    Node head;

    public static void main(String[] args) {

        FlatteningLinkedListUsingQueue flsl = new FlatteningLinkedListUsingQueue();

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);
        Node fourteen = new Node(14);
        Node fifteen = new Node(15);

        // set head node
        Node head = one;

        // set next pointers
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;

        // set down pointers
        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;


        System.out.println("original LL");
        flsl.printMultiLevelLL(head);
        System.out.println("After flattening");
        flsl.convertMultiToFlatLL(head);

    }

    public void printMultiLevelLL(Node head) {
        if (head == null) return;
        Node curr = head;
        while (curr.next != null) {
            System.out.print(" " + curr.val + " ");
            if (curr.down != null) {
                System.out.print("[");
                System.out.print(curr.down.val);
                System.out.print("]");
            }
            curr = curr.next;
        }
    }

    //Fn to convert MultilevelLL to SinglyLL
    public Node convertMultiToFlatLL(Node head) {

        //creating queue using ArrayDeque Of type Node to store down Node
        Queue<Node> q = new ArrayDeque<>();
        Node curr = head;

        while (curr != null) {

            //if curr have down pointer
            if (curr.down != null) {
                //add it to queue
                q.add(curr.down);
            }

            if (curr.next == null) {
                //At point where curr.Next point to null we pull a Node
                // Which is already being Store as down Pointer if it exists
                // and add it to curr.next
                curr.next = q.poll();
            }
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.print("Null");
        return head;
    }

    private static class Node {
        Node next, down;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node down, int val) {
            this.next = next;
            this.down = down;
            this.val = val;
        }
    }
}
