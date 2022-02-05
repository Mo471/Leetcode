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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
        boolean carry = false;

        while (true) {
            int sum = l1.val + l2.val;
            if (carry) {
                sum = sum + 1;
                carry = false;
            }

            if (sum > 9) {
                carry = true;
                result.val = sum % 10;
                if (l1.next == null || l2.next == null) {
                    result.next = null;
                    break;
                }
                l1 = l1.next;
                l2 = l2.next;
                result.next = new ListNode();
                result = result.next;
                continue;
            }

            result.val = sum;
            if (l1.next == null || l2.next == null) {
                result.next = null;
                break;
            }
            l1 = l1.next;
            l2 = l2.next;
            result.next = new ListNode();
            result = result.next;
        }


        if (l1.next != null) {
            l1 = l1.next;
            result.next = new ListNode();
            result = result.next;
            while (true) {
                int sum = l1.val;                
                if (carry) {
                    sum = sum + 1;
                    carry = false;
                }
                if (sum > 9) {
                    carry = true;
                    result.val = sum % 10;
                    if (l1.next == null) {
                        result.next = null;
                        break;
                    }
                    l1 = l1.next;
                    result.next = new ListNode();
                    result = result.next;
                    continue;
                }

                result.val = sum;
                if (l1.next == null) {
                    result.next = null;
                    break;
                }
                l1 = l1.next;
                result.next = new ListNode();
                result = result.next;

            }
        }


        if (l2.next != null) {
            l2 = l2.next;
            result.next = new ListNode();
            result = result.next;
            while (true){
                int sum = l2.val;                
                if (carry) {
                    sum = sum + 1;
                    carry = false;
                }
                if (sum > 9) {
                    carry = true;
                    result.val = sum % 10;
                    if (l2.next == null) {
                        result.next = null;
                        break;
                    }
                    l2 = l2.next;
                    result.next = new ListNode();
                    result = result.next;
                    continue;
                }

                result.val = sum;
                if (l2.next == null) {
                    result.next = null;
                    break;
                }
                l2 = l2.next;
                result.next = new ListNode();
                result = result.next;

            }
        }

        if (carry) {
            result.next = new ListNode(1);
            carry = false;
        }
        return head;
    }
}