class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int posIndex = 0;
        int negIndex = 1;
        int size = nums.length;
        int[] ans = new int[size];

        for(int ele : nums){
            if(ele >= 0){
                ans[posIndex] = ele;
                posIndex += 2;
            }
            else {
                ans[negIndex] = ele;
                negIndex += 2;
            }
        }
        return ans;
    }
}