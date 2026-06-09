class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        
        Arrays.sort(strs);
        // String ans = "";

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < strs[0].length() ; i++){
            
            char ch1 = strs[0].charAt(i);
            char ch2 = strs[strs.length - 1].charAt(i);

            if(ch1 == ch2) sb.append(ch1);
            else break;
        }
        return sb.toString();

    }
}