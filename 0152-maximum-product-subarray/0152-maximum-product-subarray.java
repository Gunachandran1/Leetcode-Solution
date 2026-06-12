class Solution {
    public int maxProduct(int[] nums) {
        
        int prefProd = 1;
        int suffProd = 1;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            
            if(prefProd == 0) prefProd = 1;
            if(suffProd == 0) suffProd = 1;

            prefProd *= nums[i];
            suffProd *= nums[n-i-1];

            int preSufMax = Math.max(prefProd,suffProd);
            maxi = Math.max(preSufMax,maxi);

        }

        return maxi;


    }
}