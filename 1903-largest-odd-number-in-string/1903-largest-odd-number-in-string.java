class Solution {
    public String largestOddNumber(String num) {
        
        String ans = "";

        for(int i =num.length()-1 ; i >= 0 ; i--){

            int digit = num.charAt(i)-'0';

            if(digit %2 ==1 ){
                for(int iter = 0 ; iter <= i ; iter++)
                {
                    ans += num.charAt(iter);
                }
                return ans;
            }
        }

        return ans;
    }
}