class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Deque<Integer> stack = new ArrayDeque<>();

        int[] ans = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=m-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }

             if(stack.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],stack.peek());
            }

            stack.push(nums2[i]);

        }

        for(int i=0;i<n;i++){
                ans[i]=map.get(nums1[i]);
        }
        
        return ans;
    }
}