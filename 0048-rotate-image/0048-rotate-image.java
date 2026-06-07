class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0 ; i <= matrix.length-2 ; i++){
            for(int j = i+1 ; j < matrix[i].length ;j++){
                swap(i ,j , matrix);
            }
        }

        for(int[] arr : matrix){
            rev(arr);
        }
    }

    public void swap(int a , int b , int[][] matrix){
        int temp = matrix[a][b];
        matrix[a][b] = matrix[b][a];
        matrix[b][a] = temp;
    }

    public void rev(int[] arr)
    {
        int st = 0;
        int end = arr.length-1;
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}