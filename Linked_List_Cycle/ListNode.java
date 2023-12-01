import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static boolean hasCycle(ListNode head) {

        // check if pointer cycles back to already traversed node

        // use ListNode instead of Integer to compare memory address instead of value
        HashSet<ListNode> set = new HashSet<>();
        ListNode pointer = head;

        while (pointer != null) {
            // if cannot add the pointer value into set as it already exists = traversed node
            if (!set.add(pointer)) {
                return true;
            }
            pointer = pointer.next;
        }

        // no cycle
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(hasCycle(head));

    }

}