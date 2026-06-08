class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);

        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];

            if(mpp.containsKey(sum - k)) count += mpp.get(sum - k);

            if(!mpp.containsKey(sum)) mpp.put(sum , 1);
            else mpp.put(sum , mpp.get(sum)+1);
        }

        return count;
    }

}