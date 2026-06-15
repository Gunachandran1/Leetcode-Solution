class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s == null || s.length() == 0) return 0;

        int i = 0;
        int j = 0;
        int maxLen = Integer.MIN_VALUE;
        int n = s.length();

        HashMap<Character,Integer> mpp = new HashMap<>();

        while(j < n){
            char ch = s.charAt(j);

            if(!mpp.containsKey(ch)) mpp.put(ch,j);
            else{
            if(mpp.get(ch)>= i) i = mpp.get(ch)+1;
            }

            int len = j - i + 1;
            if(len > maxLen) maxLen = len;
            
            mpp.put(ch,j);
            j++;
        }

        return maxLen;
    }
}