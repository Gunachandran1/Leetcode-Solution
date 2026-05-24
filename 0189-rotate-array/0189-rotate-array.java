class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rev(nums,0,n-k-1);
        rev(nums,n-k,n-1);
        rev(nums,0,n-1);

    }
    static void rev(int[] arr , int st , int end){
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            
            st++;
            end--;   
        }
    }
}