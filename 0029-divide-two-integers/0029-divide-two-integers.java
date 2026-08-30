class Solution {
    public int divide(int dividend, int divisor) {

        boolean sign = true;
        if(dividend<0 && divisor>0) sign=false;
        if(dividend>0 && divisor<0) sign=false;

        long n = dividend;
        long d = divisor;

        n= Math.abs(n);
        d= Math.abs(d);

        long storage = 0;

        while(n>=d){
            int count = 0;

            while(n>=(d<<(count+1))){
                count++;
            }

            storage = storage + (1L<<count);

            n = n - (d << count);
        }

        if(storage==(1L<<31) && sign==true){
            return Integer.MAX_VALUE;
        }
        if(storage==(1L<<31) && sign==false){
            return Integer.MIN_VALUE;
        }

        return sign?(int)storage:(int)(-storage);
    }
}