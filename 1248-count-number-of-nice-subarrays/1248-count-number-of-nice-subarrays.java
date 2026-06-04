class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return calCnt(nums,k) - calCnt(nums,k-1);
    }

    public int calCnt(int[] nums,int k){

        if(k < 0) return 0;

        int n = nums.length;
        int l = 0;
        int count = 0;
        int sum = 0;
        for(int r = 0 ; r < n ; r++){
            sum += nums[r]%2;
            while(sum > k){
                sum -= nums[l]%2;
                l++;
            }
            count += (r-l+1);
        }
        return count;
    }
}