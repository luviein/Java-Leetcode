import java.util.List;
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

       public static ListNode reverseList(ListNode head) {
        // set initial values of current and prev pointer
        ListNode prev = null;
        ListNode current = head;

        // a placeholder for the next value 
        ListNode nextVal = null;

        while(current!=null) {       
        
        // checks in next value is null with .next before assigning a value if not will have null pointer exception
        nextVal = current.next;     

        // reverses next pointer at current to prev pointer which is at null
        current.next = prev;   
        
        // set prev pointer to the left which is at the current pointer position
        prev = current;

        // sets current pointer to the next value position
        current = nextVal;

        }
        // prev is the head if the list
        return prev;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode reversedHead = reverseList(head);

        // Print the values of the reversed linked list
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
 }
class Solution {
   
}

