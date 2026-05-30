class Solution {
    public int majorityElement(int[] nums) {
        
        int cnt = 0;
        int n = nums.length;
        int ele = 0;

        for(int i = 0 ; i < n ; i++){
            
            int currEle = nums[i];
            if(cnt == 0) ele = currEle;
            if(currEle == ele )cnt ++;
            else cnt--;
        }

        cnt = 0;
        for(int values : nums){
            if(values == ele){
                cnt++;
            }
        }
        if(cnt > (n/2)) return ele;
        return 0;
    }
}