class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length > 1){
            int first0Finder = -1;
            for(first0Finder = 0; first0Finder < nums.length ; first0Finder++ ){
                if(nums[first0Finder] == 0){
                    break;
                }
            }

            if(first0Finder == -1) return ;

            for(int findingNonZero = first0Finder+1; findingNonZero < nums.length ; findingNonZero++){
                if(nums[findingNonZero] != 0){
                    int temp = nums[findingNonZero];
                    nums[findingNonZero] = nums[first0Finder];
                    nums[first0Finder] = temp;
                    first0Finder++;
                }
            }

        }
    }
}