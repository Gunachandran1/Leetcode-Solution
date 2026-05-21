class Solution {
    public boolean isValid(String s) {
        Stack<Character> stc = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '(') stc.push(')');
            else if(ch == '[') stc.push(']');
            else if(ch == '{') stc.push('}');
            else if(stc.isEmpty() || stc.pop()!=ch) return false;
        }
        return stc.isEmpty();
    }
}