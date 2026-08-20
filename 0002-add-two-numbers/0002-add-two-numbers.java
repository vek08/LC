class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while (temp1 != null) {
            list1.add(temp1.val);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            list2.add(temp2.val);
            temp2 = temp2.next;
        }

        ArrayList<Integer> result = new ArrayList<>();

        int carry = 0;
        int i = 0;

        while (i < list1.size() || i < list2.size() || carry != 0) {

            int sum = carry;

            if (i < list1.size()) {
                sum += list1.get(i);
            }

            if (i < list2.size()) {
                sum += list2.get(i);
            }

            result.add(sum % 10);
            carry = sum / 10;

            i++;
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for (int num : result) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }
}