class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int maxi = 0;

        int l = 0 , r = 0 , n = nums.length , zeroCnt = 0;

        while(r < n){
            
            if(nums[r] == 0) zeroCnt++;
            if(zeroCnt > k){
                if(nums[l] == 0) zeroCnt --;
                l++;
            }
            int len = r - l + 1;
            if(len > maxi) maxi = len;
            r++;
        }

        return maxi;
    }
}