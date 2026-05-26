class Solution {
    
    
    public static int majorityElement(int[] nums) {
        
        // Majority = Moore's Voting Algorithm
        int count = 0;
        int element = 0;
        for(int ele : nums){
             if(count == 0){
                element = ele;
            }
            if(element == ele){
                count++;
            }
            else{
                count--;
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