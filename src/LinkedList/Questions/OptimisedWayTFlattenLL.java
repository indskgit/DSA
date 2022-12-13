package LinkedList.Questions;
//Working On this not completed yet
//Without Using extra Space
public class OptimisedWayTFlattenLL {
    private static class Node {
        Node next, down;
        int val;

        public Node(int val) {
            this.val = val;
            next = down = null;
        }

    }

    public void optimisedWay(Node head) {

        if (head == null) return;


        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node temp = null;

        Node curr = head;
        while (curr != tail) {
            if (curr.down != null) {
                tail.next = curr.down;
                temp = curr.down;
//curr.down=tail;
                while (temp.next != null) {
                    temp = temp.next;
                }
                tail = temp;
            }
            System.out.print(" " + curr.val + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

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
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;


        OptimisedWayTFlattenLL op = new OptimisedWayTFlattenLL();
        op.optimisedWay(head);
    }
}
