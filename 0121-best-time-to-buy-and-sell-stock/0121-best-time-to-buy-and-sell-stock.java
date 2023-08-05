class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];
        
        for(int i = 1; i < prices.length; i++) {
            if(result < prices[i] - min) {
                result = prices[i] - min;
            }
            
            if(min > prices[i]) {
                min = prices[i];
            }
        }
        
        return result;
    }
}