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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        // Initialize a current pointer to traverse and build the result list
        ListNode current = dummy;
        // Initialize carry to handle any carryover during addition
        int carry = 0;
        
        // Iterate through the input lists until both are exhausted
        while (l1 != null || l2 != null) {
            // Calculate the sum of current digits and carry
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            // Update carry for next iteration
            carry = sum / 10;
            // Create a new node with the units place of the sum
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }
}