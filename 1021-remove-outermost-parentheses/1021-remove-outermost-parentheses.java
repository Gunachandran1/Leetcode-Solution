class Solution {
    public String removeOuterParentheses(String s) {
        
        if(s.length() == 0) return "";
        int count = 0;
        String ans = "";
        
        for(int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i);
            
            if(ch == ')') count--;
            if(count != 0) ans += ch;
            if(ch == '(') count++;

        }


        return ans;
    }
}