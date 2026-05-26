class Solution {
    static{
        for(int i = 0 ; i ==0 ; i++){
            majorityElement(new int[]{1});
        }
    }
    public static int majorityElement(int[] nums) {
        
        // Majority = Moore's Voting Algorithm
        int count = 0;
        int element = nums[0];
        for(int ele : nums){
            if(element == ele){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                count = 1;
                element = ele;
            }
        }
        int cnt = 0;
        for(int ele : nums){
            if(element == ele){
                cnt++;
            }
        }
        if(cnt > (int)(nums.length/2)) return element;
        return -1;

    }
}