class Solution {

    static void rev(int[] arr)
    {
        int i = 0 , j = arr.length-1;

        while(i < j)
        {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
            
        }
    }

    public void rotate(int[][] matrix) {
        
        for(int i = 0 ; i < matrix.length-1 ; i++)
        {
            for(int j = i+1 ; j < matrix.length ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int[] arr : matrix)
        {
            rev(arr);
        }

        
    }
}