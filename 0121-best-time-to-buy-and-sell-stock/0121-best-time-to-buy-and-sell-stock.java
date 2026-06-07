class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        

        for(int ele : prices){
            if(ele < min) min = ele;
            int profit = ele - min;
            if(profit > maxProfit) maxProfit = profit;
        }
        return maxProfit;
    }
}