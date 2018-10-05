class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
         // check Length
        int len1 = countLength(l1);
        int len2 = countLength(l2);
        
        // determine which listnode is longer
        ListNode l = len1 > len2 ? l1 : l2;
        ListNode s = len1 > len2 ? l2 : l1;
        
        int n = Math.abs(len1 - len2);
        
        // pad the zero in short linkedlist
        s = padZero(s, n);
        
        Result result = helper(l, s);
        
        if (result.carry == 0) {
            
            return result.node;
            
        } else {
            
            ListNode head = new ListNode(result.carry);
            head.next = result.node;
            return head;
            
        }
    }
    
    private Result helper(ListNode l1, ListNode l2) {
        
        
        // jump out condition
        if (l1 == null && l2 == null) return new Result(0, null);
        
        Result result = helper(l1.next, l2.next);
        
        int sum = l1.val + l2.val + result.carry;
    
        // generate a new node
        ListNode node = new ListNode(sum % 10);
        
        // connect node with next node
        node.next = result.node;
        
        // generate current node carry to pass upward
        int carry = sum / 10;
        
        return new Result(carry, node);
    }
    
    private int countLength(ListNode head) {
        
        int count = 0;
        
        while (head != null) {
            head = head.next;
            count++;
        }
        
        return count;
    }
    
    private ListNode padZero(ListNode head, int n) {
        
        while (n > 0) {
            
            ListNode prev = new ListNode(0);
            prev.next = head;
            head = prev;
            n--;
            
        }
        
        return head;
    }
    
    
}

class Result {
    
    public int carry;
    public ListNode node;
    
    public Result(int carry, ListNode node) {
        this.carry = carry;
        this.node = node;
    }
}