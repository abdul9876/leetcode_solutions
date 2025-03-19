class Solution {
    public ListNode deleteMiddle(ListNode head) {
    if(head==null||head.next == null){
        return null;
    }
 ListNode fast = head;
 ListNode slow = head;
 ListNode prev = null;
 while(fast!=null&&fast.next!=null){
    fast = fast.next.next;
    prev = slow;
    slow = slow.next;
    
 }                                                                //one solution

 prev.next = slow.next;
         return head;   
    }

}
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
    public ListNode deleteMiddle(ListNode head) {
if(head.next == null ) return null;                                                            // 2 solution
 ListNode slow = head;
 ListNode fast = head;
 fast = fast.next.next;
 while( fast!=null&&fast.next!=null){
     fast = fast.next.next;
    slow = slow.next;
 }
if(slow.next!=null){
 slow.next = slow.next.next;
}
 return head;
// if(head.next == null) return null;
// ListNode temp = head;
//   int count = 0;                                                               // 3 solution
//   while(temp!=null){
//     count++;
//     temp = temp.next;
//   }
//  int res = count/2;
//  temp = head;

    
// for(int i=0; i<res-1; i++){
//  temp = temp.next;
//     }
// temp.next = temp.next.next;
// return head;
}
}
