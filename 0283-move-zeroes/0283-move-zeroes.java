class Solution {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length;
        if(n==1) return;
        int zero = -1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                zero = i;
                break;
            }
        }

        if(zero == -1) return;

        int j = zero+1;
        for(j = j ; j < n ; j++){
            if(nums[j] != 0){
                nums[zero] = nums[j];
                nums[j] = 0;
                zero++;
            }
        }
        

    }
}