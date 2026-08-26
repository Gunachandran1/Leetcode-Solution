class Solution {
    public int majorityElement(int[] nums) {
        
        int i = 0;
        int count = 0;

        int major = nums[0];

        for(int ele : nums)
        {
            if(count == 0)
            {
                major = ele;
            }
            if(ele == major) count++;
            else count --;
        }

        return major;
    }
}