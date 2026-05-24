class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int sum = 0;
        for(int ele : nums) sum += ele;

        int formula = (n * (n + 1))/2;

        if(sum == formula) return 0;

        return formula - sum;
    }
}