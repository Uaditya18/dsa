class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        
        while (true) {
            // Check if we have at least k nodes to reverse
            ListNode temp = prevGroupEnd;
            for (int i = 0; i < k && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) break; // If less than k nodes left, stop

            // Reverse k nodes
            ListNode prev = null, curr = prevGroupEnd.next;
            ListNode nextGroupStart = temp.next;
            
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect previous group and next group
            ListNode firstReversedNode = prevGroupEnd.next;
            firstReversedNode.next = nextGroupStart;
            prevGroupEnd.next = prev;
            prevGroupEnd = firstReversedNode;
        }
        
        return dummy.next;
    }
}
