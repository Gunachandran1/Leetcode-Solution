class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxi = 0;
        int a = 0;

        int[] arr = new int[256];
        for(int i = 0 ; i < arr.length ; i++) arr[i] = -1;

        for(int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i);

            if(i < s.length() && arr[ch]!=-1){
                if(arr[ch] >= a) a = arr[ch]+1;
            }


            int len = i - a + 1;
            if(len > maxi) maxi = len;

            arr[ch] = i;



        }

        return maxi;
    }
}