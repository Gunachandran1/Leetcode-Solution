class Solution {
    public int maxSubArray(int[] nums) {
        
        // Kadane's Algorithm 

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int ele : nums){
            sum += ele;
            if(sum > maxSum) maxSum = sum;
            if(sum < 0){
                sum = 0;
            }
            
        }
        return maxSum;
    }
}