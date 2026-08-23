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
    int len = 0;
    ListNode head;
    public Solution(ListNode head) {
        this.head = head;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
    }

    public int getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(len);

        ListNode temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */