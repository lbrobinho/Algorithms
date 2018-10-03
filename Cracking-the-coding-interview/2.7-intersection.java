public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if (headA == null || headB == null) return null;
        
        // check if tail is same
        Result result1 = findTailandLength(headA);
        Result result2 = findTailandLength(headB);
        
         if (result1.tail != result2.tail) {
            return null;
        }

        // get the length of two linkedList
        int len1 = result1.size;
        int len2 = result2.size;

        // let longer linkedList move in advance  
        int k = Math.abs(len1 - len2);

        ListNode longer = len1 > len2 ? headA : headB;
        ListNode shorter = len1 > len2 ? headB : headA;

        longer = moveInAdvance(longer, k);

        // move longer and short linkedlist at the same time
        while (longer != shorter) {
            longer = longer.next;
            shorter = shorter.next;
        }

        return longer;
    }
    
     private Result findTailandLength(ListNode head) {

        int count = 1;

        while (head.next != null) {
            head = head.next;
            count++;
        }

        return new Result(count, head);
    }

    private ListNode moveInAdvance(ListNode head, int k) {

        while (k > 0 && head != null) {
            head = head.next;
            k--;
        }

        return head;
    }
}

// helper class
class Result {

    public int size;
    public ListNode tail;

    public Result(int size, ListNode tail) {
        this.size = size;
        this.tail = tail;
    }

}