class Solution {
    public boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) {
            return true;
        }

        // find middle 
        ListNode middle = findMid(head);

        // partition two parts
        ListNode secondHead = middle.next;
        middle.next = null;

        // reverse second part
        secondHead = reverse(secondHead);

        // compare two LinkedList 
        ListNode cur1 = head;
        ListNode cur2 = secondHead;

        while (cur1 != null && cur2 != null) {

            if (cur1.val == cur2.val) {
                cur1 = cur1.next;
                 cur2 = cur2.next;
            } else {
                return false;
            }
        }

        // head has one more node: acutally we don't need to check that
        return true;
    }
    
    private ListNode reverse(ListNode head) {

        // initial pointer
        ListNode prev = null;
        ListNode cur = head;

        // begin iteration
        while (cur != null) {

            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    private ListNode findMid(ListNode head) {

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}