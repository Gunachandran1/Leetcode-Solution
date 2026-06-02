class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;

        int count = 0;
        int ele = nums[0];

        for(int i = 0 ; i < n ; i++){
            int curEle = nums[i];

            if(count == 0) ele = curEle;

            if(curEle == ele) count++;
            else count --;
        }

        return ele;
    }
}