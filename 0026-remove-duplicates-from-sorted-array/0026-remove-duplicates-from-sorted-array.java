class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        if(n == 1) return 1;

        int i = 0;
        int j = 1;

        while(j < n){
            if(nums[i] != nums[j])
            {
                swap(i+1,j,nums);
                i++;
            }
            j++;


        }
        return i+1;
    }

    void swap(int a , int b , int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
      
        
}