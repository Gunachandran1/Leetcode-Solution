class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int i = 0;
        int n = nums.length;
        int preSum = 0;
        int count = 0;

        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);

        for(int j = 0; j < n ; j++){
            preSum += nums[j];

            if(mpp.containsKey(preSum - k)) count += mpp.get(preSum - k);

            if(!mpp.containsKey(preSum)) mpp.put(preSum,1);
            else mpp.put(preSum,mpp.get(preSum)+1);
        }

        return count;
    }
}