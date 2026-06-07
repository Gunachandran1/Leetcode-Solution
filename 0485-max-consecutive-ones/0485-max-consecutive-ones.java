class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        if(nums.length == 0) return 0;
        
        int maxi = 0;
        int count = 0;
        for(int ele : nums){
            if(ele == 0) count = 0;
            else {
                count++;
                if(count > maxi) maxi = count;
            }
        }
        return maxi;
    }
}