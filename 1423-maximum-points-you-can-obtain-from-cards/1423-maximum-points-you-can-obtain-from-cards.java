class Solution {
    public int maxScore(int[] cardPoints, int k) {
        

        int n = cardPoints.length;
        if(n < k) return 0;
        // k = k%n;
        int sum = 0;
        int maxSum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += cardPoints[i];
        }
        // if(n-1 == k) return sum;
        maxSum = sum;

        for(int i = k-1 ; i >= 0 ; i--){
            sum -= cardPoints[i];
            sum += cardPoints[n-1];
            n--;

            if(sum > maxSum ) maxSum = sum;

        }

        return maxSum;
    }
}