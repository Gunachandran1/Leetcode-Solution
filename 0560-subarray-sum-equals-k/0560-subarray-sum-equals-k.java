class Solution {
    public int subarraySum(int[] arr, int k) {

        int count = 0;
        int preSum = 0;

        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);


        for(int i = 0 ; i  < arr.length ; i++){

            preSum += arr[i];
            int remove = preSum - k;
            if(mpp.containsKey(remove)){
            count += (int)mpp.get(remove);
            }
            if(mpp.containsKey(preSum)){
                mpp.put(preSum,mpp.get(preSum)+1);
            }
            else{
                mpp.put(preSum , 1);
            }

            
        }

        return count;
    }
}