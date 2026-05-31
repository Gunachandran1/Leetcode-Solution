class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int low = 0 , high = nums.length-1;
        int[] arr = new int[2];

        while(low <= high){

            int mid = low + ((high-low)/2);

            if(nums[mid] >= target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        if((low == nums.length) || (nums[low]!=target)){
            return new int[]{-1,-1};
        }
        arr[0] = low;

        low = 0 ; high = nums.length-1;

        while(low <= high){

            int mid = low + ((high - low )/2);

            if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        arr[1] = low-1;

        return arr;
    }
}