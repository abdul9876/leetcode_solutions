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
public ListNode findknode(ListNode temp, int k){
    for(int i = 0; i<k-2;i++){
        if(temp==null) return null;
        else temp = temp.next;
    }
    return temp;
}
    public ListNode rotateRight(ListNode head, int k) {
            if(head==null) return null;
        if(head.next == null ) return head;
         int count = 0;
        ListNode temp = head;
        while(temp!=null){                                       // my code here i have done the k%count beacuse it takes same result as of that first one so this helps us from time limit exceedation
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i =0; i<k%count; i++){
            ListNode knode = findknode(temp,count);
            if(knode == null) break;
                ListNode front = knode.next;
            knode.next = null;
            front.next = head;
            head = front;
            temp = head;
        }
        return head;
    }
}
