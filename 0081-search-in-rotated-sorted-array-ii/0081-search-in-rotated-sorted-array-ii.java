class Solution {
    public boolean search(int[] arr, int target) {
        
        int low = 0 , n = arr.length , high = n-1;

        while(low <= high){

            int mid = low + ((high - low )/2);

            if(arr[mid] == target) return true;

            if(arr[low] == arr[mid] && arr[mid] == arr[high]){

                //shrink down the search space , until not same;
                low++;
                high--;
                continue;
            }

            else if(arr[low] <= arr[mid]){

                if(arr[low] <= target && target <= arr[mid]) high = mid - 1;
                else low = mid + 1;
            }
            else{
                if(arr[mid] <= target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }
}