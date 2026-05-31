class Solution {
    public int findMin(int[] arr) {
        
        int l = 0 , n = arr.length , h = n - 1;
        int finalMin = Integer.MAX_VALUE;

        while(l <= h){

            int mid = l + ((h-l)/2);
            
            if(arr[l] <= arr[mid]){
                int min = arr[l];
                if(min < finalMin) finalMin = min;
                l = mid + 1;
            }
            else{
                int min = arr[mid];
                if(min < finalMin) finalMin = min;
                h = mid - 1;
            }
        }

        return finalMin;
    }

}