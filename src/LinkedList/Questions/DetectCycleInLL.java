package LinkedList.Questions;

public class DetectCycleInLL {
    int size = 0;
    private Node head;
    private Node tail;

    public static void main(String[] args) {
        DetectCycleInLL dll = new DetectCycleInLL();
        dll.insertion(23);
        dll.insertion(323);
        dll.insertion(23);
        dll.insertion(24);
        dll.display();

        System.out.println(dll.checkCycle(dll.head));
//        System.out.println( dll.firstCycleNode(dll.head));
    }

    public void insertion(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public Node checkCycle(Node head) {
        Node fastPointer = head;
        Node slowPointer = head;

        if (head == null) {
//            System.out.println("NO element in LL");
            return null;
        }

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer == slowPointer) {
//                System.out.println("Cycle Detected");
                return slowPointer;
            } /*else System.out.println("No Cycle Detected");*/
        }
//        return false;
        return null;
    }

    /*public Node firstCycleNode(Node head){

        Node meet = checkCycle(head);
        Node start = head;
        while (start!= meet){
            start = start.next;
            meet = meet.next;
            if (start == meet){
                return start;
            }
        }
        return null;
    }*/

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
            size++;
        }
        System.out.println("null");
        System.out.println("Size Of ll Is : " + size);
    }

    private class Node {
        Node next;
        int val;


        public Node(int val) {
            this.val = val;
        }
    }
}
