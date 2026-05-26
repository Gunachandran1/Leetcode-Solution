class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        for(int i = n-2 ; i >= 0 ; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            int st = 0;
            int end = n-1;
            while(st < end){
                swap(st++,end--,arr);
            }
            return;
        }

        for(int i = n-1 ; i > index ; i--){
            if(arr[i] > arr[index]){
                swap(i,index,arr);
                break;
            }
        }
        int st = index+1;
        int end = n-1;
        while(st < end){
            swap(st++,end--,arr);
        }
    }

    void swap(int a , int b , int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}