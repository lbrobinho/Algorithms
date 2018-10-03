class Solution {
    public ListNode returnKthNodeToLast(ListNode head, int k) {

        //iterative

        //corner case check
        if (head == null) {
            return null;
        }

        ListNode l1 = head;
        ListNode l2 = l1;

        for (int i = k; k > 1; i++) {
            if (l2 == null) return null;
            l2 = l2.next;
        }

        while (l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1;
    }
}