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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            size++;
        }

        if(n == size) {
            head = head.next;
            return head;
        }

        int targetIdx = size - n;
        int currIdx = 1;
        ListNode currNode = head;

        while(currIdx < targetIdx) {
            currNode = currNode.next;
            currIdx++;
        }

        currNode.next = currNode.next.next;

        return head;
    }
}