class Solution {
    public int longestOnes(int[] nums, int k) {
        
        if(nums.length == 0) return 0;

        int i = 0;
        int j = 0;

        int maxi = 0;
        int zeroCnt = 0;
        int n = nums.length;

        while(j < n){

            if(nums[j] == 0) zeroCnt++;
            while(zeroCnt > k){
                if(nums[i] == 0) zeroCnt--;
                i++;
            }

            int len = j - i + 1;

            if(len > maxi) maxi = len;

            j++;
        }

        return maxi;
    }
}