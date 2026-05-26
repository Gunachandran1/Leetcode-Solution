class Solution {
    public void sortColors(int[] nums) {

        // DUTCH NATIONAL FLAG ALGORITHM

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(mid,low,nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(mid,high,nums);
                high--;
            }
        }

    }

    void swap(int a , int b , int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}