class Solution {

    void swap(int a , int b , int[] arr){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void reverse(int a , int b , int[] arr){
        
        while(a < b){
            swap(a,b,arr);
            a++;
            b--;
        }

    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k%n;
        reverse(0,n-k-1,nums);
        reverse(n-k,n-1,nums);
        reverse(0,n-1,nums);

    }

    
}