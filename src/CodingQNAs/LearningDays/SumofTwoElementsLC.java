// public class SumofTwoElementsLC {
//     public static void main(String[] args) {
//      int[] l1 = {4,5,4,3,43,3};
//      int[] l2 = {3,4,53,2,3};
/*
  System.out.println(sumOfTwoElements(l1,l2));
  
  */

// //         String s1 = " ";
// //         String s2 = " ";
// //         int l1[] = {1,2,3};
// //         int l2[] = {2,3,4};
// //         for(int i = 0; i<l1.length; i++){
// //             s1 = s1+l1[i];
// //         }
// //         for(int j = 0; j<l2.length; j++){
// //             s2 = s2+l2[j];
// //         }
// //         int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
// //         int len = 0;
// //         int temp = sum;

// //         while(temp!=0){
// //             len++;
// //             temp/=10;
// //         }
// //         int[] ans = new int[len];
// //         for(int i = ans.length-1; i>=0;i--){
// //             int rem = sum%10;
// //             ans[i] = rem;
// //             sum/= 10;
// //         }

// //         for(int i = 0;i<ans.length; i++){
// //             System.out.println(ans[i]);
// //         }
// // }
// // }

/*
       public static ListNode sumofTwoElements(ListNode l1, ListNode l2){
ListNode head=null;
//      this will be pointer to new list;
        ListNode ptr=null;

        int num1,num2,carry=0,value;
//         while both list pointers are not null;
        while(l1!=null || l2!=null){
//             number from 1st list;
            num1= l1==null? 0:l1.val;
//             num from 2nd;
            num2= l2==null? 0:l2.val;
//             adding to get a value;
            value=num1+num2+carry;
//          if greater than 9 then carry will be 1[carry cant be greater than 1 in this question]
            if(value>9){
                value=value-10;
                carry=1;
            }
//             if less than 10 then carry will be 0;
            else{
                carry=0;
            }
//             adding value to new list
            if(head==null){
                head=new ListNode(value);
                ptr=head;
            }else{
                ptr.next=new ListNode(value);
                ptr=ptr.next;
            }
//             moving our given pointers
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            
        }
//         {last case}
//         check if there is carry:
//            if yes then add it to new node.
        if(carry!=0){
            ptr.next=new ListNode(carry);
        }
        
        return head;
    }
*/
// }
// }