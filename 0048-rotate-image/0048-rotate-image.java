class Solution {
    public void rotate(int[][] mat) {
        
        for(int i = 0 ; i < mat.length - 1; i++){
            for(int j = i+1 ; j < mat[i].length ; j++){
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
        }

        for(int[] arr : mat){
            int i = 0 ;
            int  j = arr.length - 1;
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
    }
    
}