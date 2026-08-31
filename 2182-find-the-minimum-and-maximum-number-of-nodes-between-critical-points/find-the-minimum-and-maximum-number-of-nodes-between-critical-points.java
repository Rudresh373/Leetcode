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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if (head.next == null || head.next.next == null) {
            return ans;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head.next;
        ListNode prev = head;
        int i = 2;
        while (temp.next != null) {
            if (temp.val > prev.val && temp.val > temp.next.val) {
                arr.add(i);

            }
            if (temp.val < prev.val && temp.val < temp.next.val) {
                arr.add(i);
            }
            i++;
            prev = prev.next;
            temp = temp.next;

        }
        if (arr.size() < 2) {
            return ans;
        }
         // Maximum distance
        int max = arr.get(arr.size() - 1) - arr.get(0);

        // Minimum distance
        int min = Integer.MAX_VALUE;

        for (int j = 1; j < arr.size(); j++) {
            int diff = arr.get(j) - arr.get(j - 1);
            min = Math.min(min, diff);
        }

        ans[0] = min;
        ans[1] = max;
        return ans;

    }
}