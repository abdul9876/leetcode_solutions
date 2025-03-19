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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null || head== null) return null;
        ListNode fast = head;
        for(int i =0; i<n; i++){
            fast = fast.next;
        }
            if(fast==null){
            ListNode newhead = head.next;
            return newhead;
        }                                                                // optimised solution time complexity is O(N)
        ListNode slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
    
        
        slow.next = slow.next.next;
        return head;

//         int count = 0;
//         ListNode temp = head;
//         while(temp!=null){
//             count++;
//             temp = temp.next;                                        // Brute force solution where the time complexity is O(2N)

//         }
//         if(count==n){
//             ListNode newhead = head.next;
//             return  newhead;
//         }
//    int res = count - n;
//    temp = head;
// while(temp!=null){
//     res--;
//     if(res == 0) break;
//     temp = temp.next;
//    }
//    temp.next = temp.next.next;
//    return head;
    }
}
