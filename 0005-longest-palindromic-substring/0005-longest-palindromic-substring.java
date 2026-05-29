class Solution {
    public String longestPalindrome(String s) {

        if(s.length() == 0) return "";        
        String ans = "";


        for(int i = 0 ; i < s.length() ; i++){
            String str = expand(s,i,i);
            if(str.length() > ans.length())
                ans = str;
        }

            for(int i = 0 ;i < s.length()-1 ; i++){
                String str = expand(s,i,i+1);
                if(str.length() > ans.length())
                    ans = str;
        }

        return ans;
    }
    


    public String expand(String s , int left , int right){
        int n = s.length();
        while(left >= 0 &&right < n && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}