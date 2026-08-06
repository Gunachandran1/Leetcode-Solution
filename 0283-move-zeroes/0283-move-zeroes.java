class Solution {

    void swap(int a , int b , int[] arr){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    int findFirstZero(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0) return i;
        }
        return -1;
    }

    public void moveZeroes(int[] nums) {

        int n = nums.length;
        if(n == 1) return;
        
        int firstZero = findFirstZero(nums);

        if(firstZero == -1) return;

        int j = firstZero+1;

        while(j < n){
            if(nums[j] != 0){
                swap(firstZero , j , nums);
                firstZero++;
            }
            j++;
        }

    }
}