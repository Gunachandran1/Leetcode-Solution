class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int oddNoCountLessThanEqualToK = subCount(nums,k);
        int oddNoCountLessThanEqualToKminus1 = subCount(nums,k-1);

        return oddNoCountLessThanEqualToK - oddNoCountLessThanEqualToKminus1;
    }

    int subCount(int[] arr , int k){

        if(k < 0 ) return 0;
        int count = 0;

        int i = 0;
        int j = 0;
        int n = arr.length;
        int sum = 0;

        while(j < n){
            
            sum += arr[j]%2;

            while(sum > k){
                sum -= arr[i]%2;
                i++;
            }

            count += (j - i + 1);

            j++;
        }



        return count;
    }
}