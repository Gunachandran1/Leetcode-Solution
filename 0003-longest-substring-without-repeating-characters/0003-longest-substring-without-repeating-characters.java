class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s == null || s.length() == 0) return 0;

        int i = 0;
        int j = 0;
        int maxLen = Integer.MIN_VALUE;
        int n = s.length();

        int[] hash = new int[256];

        for(int k = 0 ; k < 256 ; k++){
            hash[k] = -1;
        }

        while(j < n){
            char ch = s.charAt(j);

            if(hash[ch] != -1 && hash[ch] >= i){
                i = hash[ch] +1 ;
            }

            int len = j - i + 1;
            if(len > maxLen) maxLen = len;
            
            hash[ch] = j;
            j++;
        }

        return maxLen;
    }
}