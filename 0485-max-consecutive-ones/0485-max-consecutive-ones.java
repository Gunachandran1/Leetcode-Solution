class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int maxCount = 0;
        for(int ele : nums){
            if(ele == 1){
                count++;
                if(count > maxCount) maxCount = count;
            }
            else{
                count = 0;
            }
        }

        return maxCount;
    }
}