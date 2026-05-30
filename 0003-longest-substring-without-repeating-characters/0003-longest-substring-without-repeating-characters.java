class Solution {
    public int lengthOfLongestSubstring(String s) {

        // without repetition - hashing...

        // brute - find all distinct substr and compare len with maxlen

        int maxLen = 0;

        for(int i = 0 ; i < s.length() ; i++){
            int[] arr = new int[256];
            int len = 0;
            for(int j = i ; j < s.length(); j++){
                if(arr[(int)s.charAt(j)] != 0) break;

                arr[(int)s.charAt(j)]++;
                len = j - i + 1;
                if(len > maxLen) maxLen = len;
            }
        }



        return maxLen;
    }
}