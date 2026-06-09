class Solution {
    public int maxDepth(String s) {
        
        int maxi = 0;
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                if(count > maxi) maxi = count;
            }
            else if(ch == ')') count--;
        }
        return maxi;
    }
}