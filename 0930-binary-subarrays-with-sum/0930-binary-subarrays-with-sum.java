class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return calCount(nums,goal) - calCount(nums,goal-1);
        
    }

    public int calCount(int[] nums , int goal){

        if(goal < 0) return 0;

        int count = 0;
        int l = 0;
        int n = nums.length;
        int sum = 0;
        for(int r = 0 ; r < n ; r++){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            count += (r-l+1);
        }
        return count;
    }
}