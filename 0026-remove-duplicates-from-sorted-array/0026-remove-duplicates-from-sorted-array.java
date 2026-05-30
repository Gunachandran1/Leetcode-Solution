class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l = 0 , r = 0 , n = nums.length ; 

        while(r < n){

            if(nums[l]!=nums[r]){
                int temp = nums[l+1];
                nums[l+1] = nums[r];
                nums[r] = temp;
                l++;
            }

            r++;
        }

        return l+1;
    }
}