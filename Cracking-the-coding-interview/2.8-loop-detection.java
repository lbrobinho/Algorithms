public class Solution {
    public ListNode detectCycle(ListNode head) {
        // corner case check
        if (head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        // move slow and fast pointer to let them collide
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow) {
                break;
            }
        }
        
        // check if there is collision
        if (fast == null || fast.next == null) {
            return null;
        }

        // let fast and slow move and meet, the collision point is start of the loop
         slow = head;

        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}