class Solution {
    public ListNode partition(ListNode head, int x){
    	
    	if (head == null || head.next == null) {
    		return head;
    	}

    	// one pointer to iterate
    	// one pointer to separate, number smaller than x is on the left of sep
    	ListNode cur = head;
    	ListNode sep = head;

    	while (cur != null) {

    		if (cur.val < x) {
    			swap(cur, sep);
    			cur = cur.next;
    			sep = sep.next;
    		} else {
    			cur = cur.next;
    		}
    	}

    	return head;
    }

    private void swap(ListNode l1, ListNode l2) {
    	int temp = l1.val;
    	l1.val = l2.val;
    	l2.val = temp;
    }
    
}