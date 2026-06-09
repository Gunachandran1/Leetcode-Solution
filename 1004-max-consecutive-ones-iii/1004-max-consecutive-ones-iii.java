class Solution {
    public int longestOnes(int[] nums, int k) {

        int  i = 0;
        int j = 0;
        int maxLen = 0;
        int zerocnt = 0;


        while(j < nums.length){
            if(nums[j] == 0) zerocnt++;

            while(zerocnt > k){
                if(nums[i] == 0) zerocnt--;
                i++;
            }

            int len = j - i + 1;
            if(len > maxLen) maxLen = len;

            j++;
        }

        return maxLen;
        
    }
}