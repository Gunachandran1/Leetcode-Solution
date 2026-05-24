class Solution {
    public int missingNumber(int[] nums) {
        
        int x1 = 0;
        int x2 = 0;

        for(int i = 0 ; i < nums.length ; i++){
            x1 ^= nums[i];
            x2 ^= i;
        }
        x2 ^= nums.length;

        return x1 ^ x2;
    }
}