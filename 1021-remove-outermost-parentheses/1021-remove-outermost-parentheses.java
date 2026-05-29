class Solution {
    public String removeOuterParentheses(String s) {
        
       
        String ans = "";
        int counter = 0;

        for(int i = 0 ; i < s.length() ; i++){
            
            char element = s.charAt(i);

            if(element == ')' ) counter --;
            if(counter != 0) ans += element;
            if(element == '(' ) counter ++;

            
        }

        return ans;
    }
}