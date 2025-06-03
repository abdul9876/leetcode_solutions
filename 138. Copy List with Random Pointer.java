/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Map<Node, Node> mymap = new HashMap<>();                        // brute force time complexity is O(2N) space complexity O(2n)
        while(temp!=null){
         Node newnode = new Node(temp.val);
         mymap.put(temp,newnode);
         temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            Node copynode = mymap.get(temp);
            copynode.next = mymap.get(temp.next);
            copynode.random = mymap.get(temp.random);
            temp = temp.next;
        }
        return mymap.get(head);
    }
}
