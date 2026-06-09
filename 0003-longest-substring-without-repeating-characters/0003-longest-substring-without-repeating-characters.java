class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s==null || s.length() == 0) return 0;

        int[] hash = new int[256];
        for(int i = 0 ; i < 256 ; i++){
            hash[i] = -1;
        }
        

        int maxLen = 0;
        int i = 0;
        int j = 0;
        while(j < s.length()){
            
            if(hash[s.charAt(j)] !=- 1  &&  hash[s.charAt(j)] >= i){
                i = hash[s.charAt(j)]+1;
            }

            int len = j - i + 1;
            if(len > maxLen) maxLen = len;

            hash[s.charAt(j)] = j;

            j++;
        }

        return maxLen;
    }
}