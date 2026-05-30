class Solution {
    public int lengthOfLongestSubstring(String s) {

        // without repetition - hashing..

        // optimal - using two pointers and sliding window...


        int i = 0 , j = 0 , maxLen = 0 , n = s.length();

        int[] hash = new int[256];
        for(int k = 0 ; k < hash.length ; k++) hash[k] = -1;

        while(j < n){
            if(hash[s.charAt(j)] != -1){
                if(hash[s.charAt(j)] >= i){
                    i = hash[s.charAt(j)]+1;
                }
            }

            int len = j - i + 1;
            if(len > maxLen) maxLen = len;

            hash[s.charAt(j)] = j;
            j++;

        }
        return maxLen;   

    }
}