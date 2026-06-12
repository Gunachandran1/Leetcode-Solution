class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;

        long matSum = 0;
        long matSqSum = 0;

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matSum += grid[i][j];
                matSqSum += (1L * grid[i][j]*grid[i][j]);
            }
        }

        int n = (row*col);
        long sum =  (1L * n*(n+1)) / 2;
        long sqSum = ((1L*n*(n+1))*((2L*n)+1)) / 6;

        // System.out.println(matSum + " "+matSqSum + " "+sum+ " "+sqSum);

        long x = matSum - sum;
        long y = matSqSum - sqSum;

        y /= x;
        x = (x+y) / 2;

        y -= x;

        int [] arr = new int[]{(int)x,(int)y};


        return arr;
    }
}