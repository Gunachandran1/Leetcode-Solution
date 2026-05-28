class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> stack = new Stack<>();
        String ans = "";

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == '('){
                if(stack.isEmpty()){
                    stack.push(s.charAt(i));
                }
                else{
                    ans += s.charAt(i);
                    stack.push(s.charAt(i));
                }
            }

            else{
                stack.pop();
                if(!stack.isEmpty())
                    ans += s.charAt(i);
                
            }
        }

        return ans;
    }
}