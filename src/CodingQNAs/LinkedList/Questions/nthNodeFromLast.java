package CodingQNAs.LinkedList.Questions;

public class nthNodeFromLast {
    int size = 0;
    private Node head;
    private Node tail;

    public static void main(String[] args) {


        nthNodeFromLast nth = new nthNodeFromLast();
        nth.insertAtFirst(30);
        nth.insertAtFirst(13);
        nth.insertAtFirst(33);
        nth.insertAtFirst(34);
        nth.insertAtFirst(53);

        nth.display();
        System.out.println("method 1");
        //using len {two Pointer}
        nth.deleteNthNodeFromLast(1);
        //rec
        System.out.println("method 2");
        nth.printNthFromLast(3);
        //two pointer
        System.out.println("method 3");
        nth.printNthFromLast3(4);

    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);//creating New Node First

        node.next = head;
        head = node;
        if (tail == null) { //means if there is only one element inside ll
            tail = head;
        }

    }


    //Method 1--> using length Of Linked List c
    public void deleteNthNodeFromLast(int n) {

        //Calculating ll size
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        System.out.print("Size of CodingQNAs.LinkedList :" + size);


        if (size < n) {
            System.out.println("\nindex Out Of Bound");
            return;
        }

        Node cur = head; //used to show the node value of the ll I have to delete

        int NodeToDelete = size - n + 1;//this will lead to the index which I have delete
        int prevIndexOfNodeToDelete = size - n;//This points to the prev node of node which I want to delete

        int i = 1;
        while (i < NodeToDelete) {
            cur = cur.next;
            i++;
        }
        System.out.println("\nThe Value is :" + cur.value);


        Node prev = head; //used to delete that node
        int j = 1;
        while (j < prevIndexOfNodeToDelete) {
            prev = prev.next;
            j++;
        }

        prev.next = prev.next.next;

    }


    //method 2-->Recursive Approach  {T.C--> O(n) ,S.C-->O(n)}
    public void printNthFromLast(int n) {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of n is not more than length of
        // the linked list
        if (len < n)
            return;

        temp = head;

        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;

        System.out.println(temp.value);
    }


    //method 3--> Two Pointers -->{T.C--> O(n) ,S.C-->O(n)}  {uncomment below to know more}
    /*Maintain two pointers – the reference pointer and the main pointer.
    Initialize both reference and main pointers to head.
    First, move the reference pointer to n nodes from head.
    Now move both pointers one by one until the reference pointer reaches the end.
    Now the main pointer will point to nth node from the end. Return the main pointer.*/
    public void printNthFromLast3(int n) {
        Node main_ptr = head;
        Node ref_ptr = head;

        int count = 0;
        if (head != null) {
            while (count < n) {
                if (ref_ptr == null) {
                    System.out.println(
                            n + " is greater than the no "
                                    + " of nodes in the list");
                    return;
                }
                ref_ptr = ref_ptr.next;
                count++;
            }

            if (ref_ptr == null) {

                if (head != null)
                    System.out.println("Node no. " + n
                            + " from last is "
                            + head.value);
            } else {

                while (ref_ptr != null) {
                    main_ptr = main_ptr.next;
                    ref_ptr = ref_ptr.next;
                }
                System.out.println("Node no. " + n
                        + " from last is "
                        + main_ptr.value);
            }
        }
    }


    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("null");
    }

    private class Node {
        private Node next;
        private int value;

        Node(int value) {
            this.value = value;
        }

    }

}
