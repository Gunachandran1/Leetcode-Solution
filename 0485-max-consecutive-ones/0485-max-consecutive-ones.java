class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count1 = 0;
        int maxCount1 = 0;
        for(int ele : nums){
            if(ele == 1){
                count1++;
                if(count1 > maxCount1) maxCount1 = count1;
            }
            else count1 = 0;
        }

        return maxCount1;

    }
}