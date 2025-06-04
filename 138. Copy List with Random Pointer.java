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
                          // Optimal solution where the space complexity is reduced to O(n) 
                         // time complexity is O(3n)
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
    public Node crcopy(Node head){
        Node temp = head;
        while(temp!=null){
         Node copynode = new Node(temp.val);
         copynode.next = temp.next;
         temp.next = copynode;
         temp = temp.next.next;
        }
        return head;a
    }
    public Node rand(Node head){
        Node temp = head;
        while(temp!=null){
            Node copynode = temp.next;
            if(temp.random!=null){
                copynode.random = temp.random.next;
            }
            else{
                copynode.random = null;
            }
            temp = temp.next.next;
        }
        return head;
    }
    public Node rearrange(Node head){
        Node temp = head;
      Node dummy = new Node(-1);
      Node res = dummy;
      while(temp!=null){
        res.next = temp.next;
        temp.next = temp.next.next;
        res = res.next;
        temp = temp.next;
      }
      return dummy.next;
    }
    public Node copyRandomList(Node head) {
      crcopy(head);
     rand(head);
    return rearrange(head);
    
}
}
