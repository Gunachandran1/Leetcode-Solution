class Solution {
    public String reverseWords(String s) {
        
        String res = "";

        int i = 0;
        


        while(i < s.length())

        {
            while(i < s.length() && s.charAt(i) == ' ') i++;

            if(i >= s.length()) break;

            int j = i+1;

            while(j < s.length() && s.charAt(j) != ' ') j++;

            String subStr = "";

            for(int iter = i ; iter < j ; iter++)
            {
                subStr += s.charAt(iter);
            }

            if(res.length() == 0) res += subStr;
            else res = subStr +" "+ res;

            i = j+1;
        }

        return res;
    }
}