class Solution {
    public boolean isValid(String s) {

        if(s.length() == 1 || s.length() == 0) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else if (ch == ')'){
                if(st.empty()) return false;
                if('(' == st.peek()) st.pop();
                else return false;
            }   
            else if(ch == '}'){
                if(st.empty()) return false;
                if('{' == st.peek()) st.pop();
                else return false;
            }
            else {
                if(st.empty()) return false;
                if('[' == st.peek()) st.pop();
                else return false;
            }
            
        }
        return st.isEmpty();
    }
}