class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        if(k > n) return 0;
        
        int maxSum = 0;
        int lsum = 0;
        int rsum = 0;

        for(int i = 0 ; i <=k-1 ; i++){
            lsum += cardPoints[i];
        }

        maxSum = lsum;

        for(int i = k-1 ; i >= 0 ; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[n-1];
            n--;

            int totSum = lsum + rsum;

            if(totSum > maxSum) maxSum = totSum;
        }

        return maxSum ;
    }
}