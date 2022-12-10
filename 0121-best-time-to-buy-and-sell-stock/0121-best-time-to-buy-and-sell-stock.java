class Solution {
    public int maxProfit(int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int pist = 0; // profit if sold today (we update it for every iteration)
        int profit = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < leastSoFar) {
                leastSoFar = prices[i];
            } 
            pist = prices[i] - leastSoFar;
            
            if(pist > profit) {
                profit = pist;
            }
        }
        
        return profit;
    }
}