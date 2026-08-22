class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int totalSum =0;
        int nums = n;
        while(n>0){
            int lastDigit = n%10;

            prod*=lastDigit;
            sum+=lastDigit;
            
            n = n/10;
        }
        totalSum = prod+sum;
        
        return nums%totalSum==0;
    }
}