class Solution {
    public int minDays(int[] arr, int m, int k) {

        if((long)m*k > arr.length) return -1;

        int low = Integer.MAX_VALUE;
        int high = 1;
        for(int ele : arr){
            if(ele > high) high = ele;
            if(ele < low) low = ele;
        }

        while(low <= high){

            int mid = (low) + ((high - low)/2);

            if(check(arr,mid,k) >= m){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public int check(int[] arr , int day ,int a){
        int count = 0;
        int finalCnt = 0;
        for(int ele : arr){
            if(ele <= day) count++;
            
            else 
            {
                finalCnt += (count/a); 
                count = 0;}
        }
        finalCnt += (count/a);
        return finalCnt;
    }
}