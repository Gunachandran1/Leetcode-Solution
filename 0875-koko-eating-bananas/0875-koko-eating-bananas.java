class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int high = 0;

        for(int ele : piles){
            if(ele > high) high = ele;
        }
        
        int low = 1 ;

        while(low <= high){

            int mid = low + ((high - low)/2);

            if(check(piles,mid) <= h){
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return low;
    }

    public int check(int[] arr , int ele){
        int ans = 0;

        for(int a : arr){
            ans += Math.ceil(((double)a/ele));
        }
        return ans;
    }
}