class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int ele : nums) xor ^= ele;

        return xor;
    }
}