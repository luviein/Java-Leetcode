public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode mergeList = new ListNode();
            // set current pointer to the head of merge list
            ListNode current = mergeList;
            while(list1 != null && list2 != null) {
                  
                  if(list1.val < list2.val) {
                        // if list 1 is smaller than list 2 value, insert smaller value in first (list 1)
                        current.next = list1;

                        // set the next value of list1
                        list1 = list1.next;
                  } else {
                        // if list1 == list2 || list1 > list2
                        current.next = list2;
                        list2 = list2.next;
                  }

                  // set the current pointer to the next position
                  current = current.next;

              
                  
            }
            // to add in the remaining value after main loop ends

            // if there is remaining in list 1
            if (list1 != null) {
                  current.next = list1;
            // if there is remaining in list 2
            } else if (list2 != null) {
                  current.next = list2;
            }

            // must use .next to return the head if not it will return the first element which is 0
            return mergeList.next;
    }





}