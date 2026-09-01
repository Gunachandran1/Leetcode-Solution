class Solution {
    public String removeOuterParentheses(String s) {
        
        int count = 0;
        String res = "";

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);

            if(ch == '(') count++;
            if(count > 1) res += ch;
            if(ch == ')') count--;

            
        }

        return res;
    }
}