class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public void reverse(int[] arr,int stind,int endind){
            while(stind < endind){
                arr[stind]+= arr[endind];
                arr[endind] = arr[stind] - arr[endind];
                arr[stind] -= arr[endind];
                stind++;
                endind--;
            }
    }
}