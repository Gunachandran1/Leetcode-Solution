class Solution {
    public boolean check(int[] nums) {
        
        int n = nums.length;
        if(n==1) return true;

        int count = 1;
        int maxCount = 0;

        for(int i = 0 ; i < 2*n-2 ; i++){

            if(nums[i%n] <= nums[(i+1)%n]){
                count ++;
                if(count > maxCount) maxCount = count;
            }
            else{
                count = 1;
            }
        }

        return maxCount >= n;
    }
}