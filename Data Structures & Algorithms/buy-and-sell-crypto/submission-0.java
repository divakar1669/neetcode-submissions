class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ;

        if(n<=1){
            return 0;
        }
        int max =0 , buy =prices[0];

        for(int i=0;i<n;i++){
            buy = Math.min(prices[i],buy);
            int profit = prices[i] - buy;
            max =Math.max(max,profit);
        }

        return max;
        
    }
}
