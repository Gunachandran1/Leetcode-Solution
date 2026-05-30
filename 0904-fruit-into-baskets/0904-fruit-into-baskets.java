class Solution {
    public int totalFruit(int[] fruits) {
        
        // maxi length subarray with atmost 2 types of numbers

        int maxi = 0;

        int l = 0 , r = 0 , n = fruits.length;
        Map<Integer,Integer> mpp = new HashMap<>();

        while(r < n){
            if(!mpp.containsKey(fruits[r])) mpp.put(fruits[r],1);
            else mpp.put(fruits[r],mpp.get(fruits[r])+1);

            if(mpp.size() > 2){
                mpp.put(fruits[l],mpp.get(fruits[l])-1);
                if(mpp.get(fruits[l]) == 0) mpp.remove(fruits[l]);
                l++;
            }
            int len = r - l + 1;
            if(len > maxi) maxi = len;
            r++;
        }

        return maxi;
    }
}