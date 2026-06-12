class Solution {
    public int maxProduct(int[] nums) {


        
        int maxProd = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int prod = 1;
            for(int j = i ; j < n ; j++){
                prod*=nums[j];
                if(prod > maxProd) maxProd = prod;
            }
        }
        
        return maxProd;
    }

}