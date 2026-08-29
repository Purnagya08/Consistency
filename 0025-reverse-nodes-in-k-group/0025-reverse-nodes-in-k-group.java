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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        while(count < k) {
            if(curr == null) {
                return head;
            }

            curr = curr.next;
            count++;
        }

        ListNode prevNode = reverseKGroup(curr, k);

        curr = head;
        count = 0;

        while(count < k) {
            ListNode next = curr.next;
            curr.next = prevNode;

            prevNode  = curr;
            curr = next;

            count++;
        }

        return prevNode;
    }
}