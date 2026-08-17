class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list1;

        int cnt = 0;
        while (cnt < a - 1) {
            temp1 = temp1.next;
            cnt++;
        }

        cnt = 0;
        while (cnt < b) {
            temp2 = temp2.next;
            cnt++;
        }

        ListNode temp3 = list2;
        
        while (temp3.next != null) {
            temp3 = temp3.next;
        }
        temp1.next = list2;
        temp3.next = temp2.next;

        return list1;
    }
}