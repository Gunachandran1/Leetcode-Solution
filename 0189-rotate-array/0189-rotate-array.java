class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k%n;

        if(n==1) return;
        rev(0,n-k-1,nums);
        rev(n-k , n-1 , nums);
        rev(0 , n-1 , nums);

    }

    void rev(int a , int b , int[] arr){
        while(a < b)
        {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}