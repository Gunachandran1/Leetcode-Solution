class Solution {
    public void nextPermutation(int[] nums) {
        
        int size = nums.length;

        for(int i = size-1 ; i > 0 ; i--){

            if(nums[i] > nums[i-1]){
                int index = i-1;
                for(int j = size - 1 ; j >index ; j--){
                    if(nums[j] > nums[index]){
                        swap(index,j,nums);break;
                    }
                }
                rev(index+1,size-1,nums);
                return;

            }
        }
        rev(0,size-1,nums);
    }

    public void rev(int st , int end , int[] arr){
        
        while(st < end){
            swap(st,end,arr);
            st++;
            end--;
        }
    }


    public void swap(int ele1 , int ele2 , int[] arr){
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }
}