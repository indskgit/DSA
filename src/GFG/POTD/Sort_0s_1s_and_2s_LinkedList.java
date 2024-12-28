package GFG.POTD;

public class Sort_0s_1s_and_2s_LinkedList {
    Node head;

    public static void main(String[] args) {
        Sort_0s_1s_and_2s_LinkedList sort = new Sort_0s_1s_and_2s_LinkedList();

        sort.push(0);
        sort.push(1);
        sort.push(0);
        sort.push(2);
        sort.push(0);
        sort.push(1);
        sort.push(2);

        System.out.println("Before sorting");
        sort.printList(sort.head);

        sort.SortedList(sort.head);
        System.out.println("After sorting");
        sort.printList(sort.head);

    }

    private int SortedList(Node head) {
        int[] count = {0, 0, 0};
        Node Ptr = head;
        //counting the frequency of 0s,1s and 2s
        while (Ptr != null) {
            count[Ptr.data]++;
            Ptr = Ptr.next;
        }
        int i = 0;
        Ptr = head;
        while (Ptr != null) {
            if (count[i] == 0) {
                i++;
            } else {
                Ptr.data = i;
                --count[i];
                Ptr = Ptr.next;
            }
        }
        return head.data;
    }

    void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


}
