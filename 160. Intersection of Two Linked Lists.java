/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
         ListNode temp1 = headB;
    //     Map<ListNode, Integer> map= new HashMap<>(); 
    //    int i = 0;
    //     while(temp!=null){
    //       map.put(temp,i);
    //       temp = temp.next;
    //       i++;
    //     }
    //     i =0;                                                               // O(N1+N2) complexity and space compexlity O(N) brute force approach
    //     while(temp1!=null){
    //         if(map.containsKey(temp1)) return temp1;
    //         else{
    //             map.put(temp1,i);
    //             temp1 = temp1.next;
    //             i++;
    //         }

    //     }
    //     return null;
    if(headA==null||headB==null) return null;
   
    while(temp!=temp1){
        temp = temp.next;
        temp1 = temp1.next;                                             //O(N1+N2) complexity optimal approach space complexity O(1)
        if(temp==temp1) return temp;
        if(temp==null) temp = headB;
        if(temp1==null) temp1 = headA;
    }
    return temp;
  
    }
}
