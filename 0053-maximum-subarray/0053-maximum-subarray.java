class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        if(n==1) return nums[0];
        
        int sum = 0;
        int  maxSum = Integer.MIN_VALUE;

        for(int ele : nums){

            sum += ele;
            if(sum > maxSum) maxSum = sum;
            if(sum < 0) sum = 0;
        }

        return maxSum;
    }
}