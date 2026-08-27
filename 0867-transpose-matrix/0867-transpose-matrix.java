class Solution {
    public int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        if(row != col)
        {
        int[][] res = new int[matrix[0].length][matrix.length];
        
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[i].length ; j++)
            {       
                    res[j][i] = matrix[i][j];   
            }   
        }

        return res;
        }
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = i+1 ; j < matrix[0].length ; j++)
            {   
                int temp = matrix[i][j];    
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }   
        }

        return matrix;
        
        
    }

    
}