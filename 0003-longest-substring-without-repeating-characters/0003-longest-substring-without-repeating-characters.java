class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = findLongestSubstringLength(s);

        return maxLength;
    }


    static int findLongestSubstringLength(String s){

        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        int[] hash = new int[256];

        for(int i = 0 ; i < 256 ; i++){
            hash[i] = -1;
        }

        while(right < n){

            if(hash[s.charAt(right)] != -1 && hash[s.charAt(right)] >= left){
                left = hash[s.charAt(right)]+1;
            }

            int len = right - left + 1;

            if(len > maxLen) maxLen = len;

            hash[s.charAt(right)] = right;
            right++;
        }

        return maxLen;
    }
}