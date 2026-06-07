class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) mid++;
            else{
                swap(mid,high,nums);
                high--;
            }
        }
    }

    public void swap(int ele1 , int ele2 , int[] arr){
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }
}