class Solution {
    public void deleteMiddleNode(ListNode n) {
        // corner case: can't be null or last node
        if (n == null || n.next == null) {
            return;
        }

        ListNode next = n.next;
        //copy value;
        n.val = next.val;
        n.next = n.next.next;
    }
}