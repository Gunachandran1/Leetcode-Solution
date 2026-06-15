class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int lessEqualK = subArray(nums,k);
        int lessEqualKminus1 = subArray(nums,k-1);

        return lessEqualK - lessEqualKminus1;
    }

    int subArray(int[] arr , int k){
        
        int i = 0;
        int j = 0;
        int count = 0;
        int n = arr.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        while(j < n){
            int ele = arr[j];
            if(!mpp.containsKey(ele)) mpp.put(ele,1);
            else mpp.put(ele , mpp.get(ele)+1);

            while(mpp.size() > k){
                int ele1 = arr[i];
                mpp.put(ele1,mpp.get(ele1)-1);
                if(mpp.get(ele1) == 0) mpp.remove(ele1);
                i++;
            }
            count += (j - i + 1);
            j++;
        }


        return count;
    }
}