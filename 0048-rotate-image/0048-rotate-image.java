class Solution {
    public void rotate(int[][] mat) {
        
        for(int i = 0 ; i < mat.length - 1; i++){
            for(int j = i+1 ; j < mat[i].length ; j++){
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
        }

        for(int i = 0 ; i < mat.length ; i++){
            int x = 0;
            int j = mat[i].length -1;
            while(x < j){
                int temp = mat[i][x];
                mat[i][x] = mat[i][j];
                mat[i][j] = temp;
                x++;
                j--;
            }
        }
    }
    
}