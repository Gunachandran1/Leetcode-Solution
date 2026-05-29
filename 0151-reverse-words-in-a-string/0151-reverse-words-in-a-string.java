class Solution {
    public String reverseWords(String s) {
        
        int i = 0;
        int n = s.length();
        String ans = "";

        while(i < n){
            while(i < n && s.charAt(i) == ' ') i++;
            if(i >= n) break;
            int j = i+1;
            while(j < n && s.charAt(j) != ' ') j++;

            String substr = s.substring(i,j);

            if(ans.length() == 0) ans += substr;
            else ans = substr + " " + ans;
             i = j+1;
        }

         return ans;
    }
}