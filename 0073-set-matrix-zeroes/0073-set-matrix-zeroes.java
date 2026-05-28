class Solution {
    public void setZeroes(int[][] arr) {

        int col0 = 1;

        int n = arr.length;
        int m = arr[0].length;

        // Step 1: Mark rows and columns
        for (int i = 0; i < n; i++) {

            if (arr[i][0] == 0)
                col0 = 0;

            for (int j = 1; j < m; j++) {

                if (arr[i][j] == 0) {

                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Step 2: Fill zeroes from back
        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 1; j--) {

                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }

            if (col0 == 0) {
                arr[i][0] = 0;
            }
        }
    }
}