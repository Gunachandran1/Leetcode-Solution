class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int ele : nums){
            sum += ele;
            if(sum > maxSum) maxSum = sum;
            if(sum < 0) sum = 0;
            
        }
        return maxSum;
    }
}