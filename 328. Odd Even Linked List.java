/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode even = head.next;
        ListNode odd = head;
        ListNode evenhead = head.next;
        while(even!=null&&even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        // if(head==null || head.next== null) return head;
        // int count = 0;
        // int i =0;
        // ListNode temp = head;
        // while(temp!=null){
        //     count++;
        //     temp = temp.next;
        // }
        // temp = head;
        // int[] arr = new int[count];
        // while(temp!=null){                                                                     // O(N) space complexity O(N) time complexity
        //     arr[i++] = temp.val;
        //         if(temp.next!=null) {temp = temp.next.next;
        //         }
        //         else break;
        // }
        // temp = head.next;
        // while(temp!=null){
        //     arr[i++] = temp.val;
        //     if(temp.next!= null){ temp = temp.next.next;
        
        //     }
        //     else break;
     
        // }
        // i = 0;
        // temp = head;
        // while(temp!=null){
        //     temp.val = arr[i];
        //     temp = temp.next;
        //     i++;
        // }
         return head;    
        }
}
