class Solution {
    public String removeOuterParentheses(String s) {
        
        if(s.length() == 0) return "";
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(st.empty()) st.push(ch);
                else {
                    st.push(ch);
                    ans+=ch;
                }
            }
            else{
                st.pop();
                if(!st.empty()) ans+=ch;
            }
        }

        return ans;
    }
}