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

/**
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp.val);
           temp = temp.next;
        }
        temp = head;
        while(temp!=null){                                                                        //brute force solution
            if(stack.pop()!=temp.val){
                return false;
            }
            temp = temp.next;
        }
        return true;

    }
}*/

// optimal soution


class Solution {
    public ListNode reverseLinkedlist(ListNode head){
        ListNode prev = null;
        ListNode front = null;
        while(head!=null){
            front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newnode = reverseLinkedlist(slow.next);
        ListNode first = head;
        ListNode second = newnode;
        while(second!=null){
            if(first.val!=second.val) return false;
            first = first.next;
            second = second.next;
        }
        reverseLinkedlist(newnode);
        return true;
    }
}
