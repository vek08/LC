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
        ListNode prev=null;
        ListNode curr = head;
        ListNode cNext = curr.next;
        List<Integer> ans = new ArrayList<>();
        int cnt = 1;
        while(curr!=null){
            if(prev==null){}
            else if(curr.val<prev.val && curr.val<cNext.val){
                ans.add(cnt);
            }
            else if(curr.val>prev.val && curr.val>cNext.val){
                ans.add(cnt);
            }
            
            cnt++;
            prev = curr;
            curr = cNext;
            if(cNext.next==null) break;
            cNext = cNext.next;
            
        }
        if(ans.size()<2) return new int[]{-1,-1};
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;
        
        for(int i=0;i<ans.size()-1;i++){
            int distance = ans.get(i+1)-ans.get(i);
            minDistance = Math.min(minDistance,distance);
        }
        maxDistance = ans.get(ans.size()-1)-ans.get(0);
        return new int[]{minDistance,maxDistance};
    }
}