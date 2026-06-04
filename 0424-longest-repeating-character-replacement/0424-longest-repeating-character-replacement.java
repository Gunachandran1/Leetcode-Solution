class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxi = 0;
        int n = s.length();
        
        int l = 0;
        int[] arr = new int[26];
        int maxFreq = 0;
        for(int r = 0 ; r < n ; r++){
            arr[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq , arr[s.charAt(r)-'A']);

            if((l <= r) &&((r - l + 1) - maxFreq) > k){
                arr[s.charAt(l)-'A']--;
                maxFreq = Math.max(maxFreq , arr[s.charAt(l)-'A']);
                l++;
            }
            int len = r - l + 1;
            if(len > maxi) maxi = len;
        }

        return maxi;
    }
}