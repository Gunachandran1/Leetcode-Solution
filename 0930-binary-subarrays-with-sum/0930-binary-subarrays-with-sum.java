class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        

        int lessThanEqualToK = subArrayLengthFinder(nums,goal);
        int lessThanEqualToKmin1 = subArrayLengthFinder(nums,goal-1);

        return lessThanEqualToK - lessThanEqualToKmin1;
    }

    int subArrayLengthFinder(int[] arr , int k){

        if(k < 0) return 0; 
        int i = 0;
        int j = 0;
        int n = arr.length;
        int count = 0;
        int sum = 0;

        while(j < n){
            sum += arr[j];
            
            while( sum > k){
                sum -= arr[i];
                i++;
            }

            count+= (j - i + 1);
            
            j++;
        }

        return count;
    }
}