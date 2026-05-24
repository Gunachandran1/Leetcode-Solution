class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int formula = (n * (n + 1))/2;

        for(int ele : nums) formula -= ele;
        

        return formula;
    }
}