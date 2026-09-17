class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int n = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            n++;
        }

        k = k % n;

        if (k == 0) {
            return head;
        }

        return rotate(head, k);
    }

    private ListNode rotate(ListNode head, int k) {
        int n = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            n++;
        }

        temp.next = head;

        int count = 0;

        ListNode newHead = head;

        while (count < n - k) {
            newHead = newHead.next;
            count++;
        }

        count = 0;
        ListNode newTail = head;

        while (count < n - k - 1) {
            newTail = newTail.next;
            count++;
        }

        newTail.next = null;

        return newHead;
    }
}