package LeetCode;

public class Q23_MergeTwoSortedLists {

    static Node head;
    Node tail;

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
        Node(int val,Node head){
            this.val = val;
            this.next = head;
        }
    }

     static void list1(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

     static Node mergeTwoLists(Node l1, Node l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {

//        list1(23);
//        list1(27);
//        list1(28);
//        list1(30);
//        list1(34);

    }
}
