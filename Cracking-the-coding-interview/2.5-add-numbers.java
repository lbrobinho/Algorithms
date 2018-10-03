class Solution {
    public ListNode sumLists(ListNode l1, ListNode l2) {

    		// set up a carry
    		int carry = 0;

    		// set up a dummy node
    		ListNode dummy = new ListNode(0);
    		ListNode cur = dummy;

    		while (l1 != null || l2 != null) {

    			int a = l1 == null ? 0 : l1.val;
    			int b = l2 == null ? 0 : l2.val;

    			int sum = a + b + carry;

    			int val = sum % 10;
    			carry = sum / 10;

    			ListNode node = new ListNode(val);
    			cur.next = node;
    			cur = node;

    			// move l1 or l2
    			if (l1 != null) {
    				l1 = l1.next;
    			}

    			if (l2 != null) {
    				l2 = l2.next;
    			}
    		}

            if (carry > 0) {
                ListNode node = new ListNode(carry);
                cur.next = node;
                cur = node;
            }
            
    		return dummy.next;
    }
    
}