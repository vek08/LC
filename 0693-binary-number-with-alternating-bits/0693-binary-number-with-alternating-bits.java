class Solution {
    public boolean hasAlternatingBits(int n) {
        String result = "";

        while(n>0){

            if(n%2==1) result+='1';
            else result+='0';

            n=n/2;
        }

        String rev = new StringBuilder(result).reverse().toString();

        for (int i = 1; i < rev.length(); i++) {
            if (rev.charAt(i) == rev.charAt(i - 1))
                return false;
        }

        return true;

    }
}