class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0;
        int j = matrix[i].length-1;

        while(i < matrix.length && j >= 0)
        {
            int ele = matrix[i][j];
            if(ele == target) return true;
            
            else if(ele > target) j--;
            
            else i++;
        }

        return false;
    }
}