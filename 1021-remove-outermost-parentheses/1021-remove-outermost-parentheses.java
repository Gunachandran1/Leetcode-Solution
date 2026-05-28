class Solution {
    public String removeOuterParentheses(String s) {
        

        int count = 0;

        StringBuilder stt = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ele = s.charAt(i);

            if(ele == ')') count--;
            if(count != 0)stt.append(ele);
            if(ele == '(') count++;
        }

        return stt.toString();
    }
}