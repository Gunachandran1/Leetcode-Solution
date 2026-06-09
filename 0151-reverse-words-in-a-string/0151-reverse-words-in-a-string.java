class Solution {
    public String reverseWords(String s) {
        
        String ans = "";

        int i= 0;
        while(i < s.length()){

            while(i < s.length() && s.charAt(i) == ' ') i++;

            if(i >= s.length()) break;

            int j = i+1;

            while(j < s.length() && s.charAt(j) != ' ')j++;

            String substr = s.substring(i,j);
            
            if(ans.length() == 0) ans += substr;
            else ans = substr + " " + ans;

            i = j + 1;      
                    
        }

        return ans;
    }
}