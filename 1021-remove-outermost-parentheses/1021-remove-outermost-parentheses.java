class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> stack = new Stack<>();
        String ans = "";

        for(int i = 0 ; i < s.length() ; i++){
            
            char element = s.charAt(i);

            if(element == '(')
            {
                if(stack.isEmpty()) stack.push(element);
                else
                {
                stack.push(element);
                ans += element;
                }
            }
            else
            {
                stack.pop();
                if(!stack.isEmpty()){
                    ans+=element;
                }
            }
            
        }

        return ans;
    }
}