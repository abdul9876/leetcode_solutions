/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/**
The method used in this code is called the tourtise and the hare method where the fast and the slow pointers are used and when they meet with each other that tells the loop in the code.
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
                   if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
