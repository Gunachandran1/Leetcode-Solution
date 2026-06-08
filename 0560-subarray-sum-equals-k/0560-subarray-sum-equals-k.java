class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int preSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            
            preSum += nums[i];

            if(mpp.containsKey(preSum - k)) count+=mpp.get(preSum - k);

            if(!mpp.containsKey(preSum)) mpp.put(preSum , 1);
            else mpp.put(preSum , mpp.get(preSum)+1);


        }

        
        return count;
    }
}