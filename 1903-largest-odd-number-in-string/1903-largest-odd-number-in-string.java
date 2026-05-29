class Solution {
    public String largestOddNumber(String num) {
        
        int n = num.length();
        String ans = "";

        for(int i = n-1 ; i >=0 ; i--){
            
            char ele = num.charAt(i);

            if((ele-'0')%2 != 0) {
                return ans += num.substring(0,i+1);
            }
        }
        return ans;
    }

}