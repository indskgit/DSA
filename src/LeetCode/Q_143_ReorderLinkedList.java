package LeetCode;
public class Q_143_ReorderLinkedList {
    static ListNode head;
    static class ListNode {
        ListNode next;
        int val;
        ListNode(int val) { this.val = val; }
    }

    static ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    static ListNode rev(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward = null;
        while(curr!= null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    static void reorderList(ListNode head) {

        ListNode mid = mid(head);
        ListNode midNext = mid.next;
        mid.next = null;
        ListNode p2 = rev(midNext);
        ListNode p1 = head;

        ListNode temp;

        while(p1!=null && p2!=null){
            temp = p1.next;
            p1.next = p2;

            p1 = p2;
            p2 = temp;
            System.out.println(head.val + " ");
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

    }
}
