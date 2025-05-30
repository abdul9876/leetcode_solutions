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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public ListNode getkthnode(ListNode temp, int k){
        for(int i = 0; i<k-1; i++){
         if(temp==null) return null;
         else{
            temp = temp.next;
         }}
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
     ListNode temp = head;
     ListNode prev = null;
     while(temp!=null){
        ListNode knode = getkthnode(temp,k);
        if(knode == null) {
            if(prev!=null) prev.next = temp;
            break;
        }
        ListNode next = knode.next;
        knode.next = null;
         reverse(temp);
    
        if(temp == head) head = knode;
        else{
          prev.next = knode;
        }
        prev = temp;
        temp = next;
 
     }
     return head;
    }

    }
