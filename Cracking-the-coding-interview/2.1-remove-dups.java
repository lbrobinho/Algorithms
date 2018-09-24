class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	//corner case check
        if (head == null || head.next == null) {
        	return head;
        }

        ListNode cur = head;

        while (cur != null) {

        	ListNode runner = cur;

        	while (runner.next != null) { 

       			if (runner.next.val == cur.val) {
       				runner.next = runner.next.next; 
       				/* Tricky point: you need to check 
						again, runner.next == cur.val, and then move forward,
						because runner.next has changed already.
       				*/
       			} else {
       				runner = runner.next;
       			}

       			
        	}

        	cur = cur.next;
        }
    }
}
