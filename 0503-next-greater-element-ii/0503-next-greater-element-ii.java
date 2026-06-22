class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;

        int[] arr = new int[n];
        int ind = 0;

        for(int i = 0 ; i < n ; i++){
            int greatest = -1;

            for(int j = i+1 ; j < (n+i) ; j++){

                int index = j%n;

                if(nums[index] > nums[i]){
                    greatest = nums[index];
                    arr[ind++] = greatest;
                    break;
                }
            }
            if(greatest == -1) arr[ind++]= -1;
        }

        return arr;
    }
}