class Solution {
    public String removeOuterParentheses(String s) {
        
        String ans = "";
        int count = 0;

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ele = s.charAt(i);

            if(ele == ')') count--;
            if(count != 0)ans+=ele;
            if(ele == '(') count++;
        }

        return ans;
    }
}