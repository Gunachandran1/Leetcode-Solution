class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        
        int m = mat.length ;
        int n = mat[0].length ;

        int left = 0;
        int top = 0;
        int right = n-1;
        int btm = m-1;

        List<Integer> result = new ArrayList<>();

        while(left <= right && top <= btm){
            for(int i = left ; i <= right ; i++){
                result.add(mat[top][i]);
            }
            top++;

            for(int i = top ; i <= btm ; i++){
                result.add(mat[i][right]);
            }
            right--;

            if(top <= btm){
                for(int i = right ; i >= left ; i--){
                    result.add(mat[btm][i]);
                }
                btm--;
            }

            if(left <= right){
                for(int i = btm ; i >= top ; i--){
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}