/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp_node = new ListNode(1); // used to build new spliced linked list
    	ListNode final_node = temp_node; // only used to return final result
    		
    	while(l1 != null && l2 != null) {
    		
    		if(l1.val <= l2.val) {
    			
    			temp_node.next = l1;
    			l1 = l1.next;
    			
    		}
    		
    		else if(l1.val > l2.val) {
    			
    			temp_node.next = l2;
    			l2 = l2.next;
    			
    		}
    		
    		temp_node = temp_node.next;
    				
    	}
    	
    	if(l1 == null) {
    		
    		temp_node.next = l2;
    		
    	} else if(l2 == null) {
    		
    		temp_node.next = l1;
    		
    	}
    	
    	return final_node.next;
    }
}