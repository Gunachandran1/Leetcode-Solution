class Solution {
    public int singleNumber(int[] nums) {
        
        int once = 0;
        int twos = 0;

        for(int ele : nums){
            once = (ele ^ once) & ~twos;
            twos = (ele ^ twos) & ~once;
        }

        return once;
    }
}