class Solution {
    public String reverseWords(String s) {
        
        int i = 0;
        String ans = "";
        int n = s.length();

        while(i < n){
            
            while(i < n && s.charAt(i)==' ') i++;
            if(i >= n) break;
            int j = i+1;

            while(j < n && s.charAt(j)!=' ') j++;

            String subStr = s.substring(i,j);

            if(ans.length() == 0) ans += subStr;
            else{
                ans = subStr + " " + ans;
            }
            i = j+1;
        }

        return ans;
    }
}