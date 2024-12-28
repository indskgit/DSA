package LinkedList.Questions;

public class SortLL_0s_1s_2s {
    Node head;

    public static void main(String[] args) {
        SortLL_0s_1s_2s srt = new SortLL_0s_1s_2s();

        srt.Insert(0);
        srt.Insert(1);
        srt.Insert(0);
        srt.Insert(2);
        srt.Insert(0);
        srt.Insert(1);
        srt.Insert(2);

        System.out.println("Before sorting");
        srt.printList(srt.head);

        srt.SortedList(srt.head);
        System.out.println("After sorting");
        srt.printList(srt.head);

    }

    private int SortedList(Node head) {
        int[] countFreq = {0, 0, 0};
        Node Ptr = head;
        //counting the frequency of 0s,1s and 2s
        while (Ptr != null) {
            countFreq[Ptr.data]++;
            Ptr = Ptr.next;
        }
        int i = 0;
        Ptr = head;
        while (Ptr != null) {
            if (countFreq[i] == 0) {
                i++;
            } else {
                Ptr.data = i;
                --countFreq[i];
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

    void Insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
