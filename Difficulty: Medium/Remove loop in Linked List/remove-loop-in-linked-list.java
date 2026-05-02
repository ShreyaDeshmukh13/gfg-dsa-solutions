class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop
        boolean hasLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        // No loop → nothing to remove
        if (!hasLoop) return;

        // Step 2: Find start of loop
        slow = head;

        // Special case: loop starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        // General case
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Break loop
        fast.next = null;
    }
}