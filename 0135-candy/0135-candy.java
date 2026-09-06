class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(n==0) return 0;

        int l = 1;
        int r = 1;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> finall = new ArrayList<>();

        left.add(1);
        right.add(1);

        //from left side
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                l++;
                left.add(l);
            }
            else {
                left.add(1);
                l=1;
            }
        }

        //from right side
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                r++;
                right.add(r);
            }
            else{
                right.add(1);
                r=1;
            }
        }
        
        Collections.reverse(right);

        //final 
        for(int i=0;i<n;i++){
            finall.add(Math.max(left.get(i), right.get(i)));
        }

        //addition of final elements
        int totalCandy = 0;
        for(int i=0;i<n;i++){
            totalCandy+=finall.get(i);
        }
        return totalCandy;
    }
}