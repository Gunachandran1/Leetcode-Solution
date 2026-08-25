class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length <= 1) return nums.length;

        int st = 0;
        int iter = st+1;

        while(iter <= nums.length-1)
        {
            if(nums[st] != nums[iter])
            {
                int temp = nums[st+1];
                nums[st+1] = nums[iter];
                nums[iter] = temp;

                st++;
            }
            iter++;
        }

        return st+1;
    }
}