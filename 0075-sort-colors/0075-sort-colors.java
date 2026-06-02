class Solution {
    public void sortColors(int[] nums) {
        
        int  n = nums.length;
        
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(low , mid , nums);
                low ++;
                mid ++;
            }
            else if(nums[mid] == 1) mid++;
            else{
                swap(mid , high , nums);
                high--;
            }
        }
    }

    void swap(int a , int b , int[] arr){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;        
        }
    }
}