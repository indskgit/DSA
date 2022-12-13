package LinkedList.Questions;

public class CheckPalindromeLL {
    Node tail;
    int size = 0;
    private Node head;

    public static void main(String[] args) {
        CheckPalindromeLL cll = new CheckPalindromeLL();
        cll.insertion(1);
        cll.insertion(13);
        cll.insertion(1);
        cll.insertion(32);
        cll.insertion(42);

        cll.display();

        cll.isPalindrome(cll.head);
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

    public Node findMiddle(Node head) {
        Node fastPtr = head;
        Node slowPtr = head;

        while (fastPtr.next != null && fastPtr.next.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        System.out.println("The Middle element is: " + slowPtr.val);
        return slowPtr;
    }

    public Node reverse(Node head) {

        //iterative way
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {

        // step 1. first condition of ll if single element is present its palindrome
        if (head == null || head.next == null) {
            System.out.println("The Given LL is Palindrome");
            return true;
        }

        //Step 2. find Middle of ll

        Node middle = findMiddle(head);     // this will give the middle which will be last node of first Half of ll

        //Step 3. reverse the second half or first half of ll

        Node secondHalfStart = reverse(middle.next);    // this will reverse the second half of ll and return the [NewHead]

        //step 4. Now checking For Every element of firstHalf to secondHalf

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                System.out.println("The Given LL is Not A Palindrome");
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        System.out.println("The Given LL is Palindrome");
        return true;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
            size++;
        }
        System.out.println("null");
    }

    private class Node {
        Node next;
        int val;

        //constructor
        public Node(int val) {
            this.val = val;
        }
    }
}
