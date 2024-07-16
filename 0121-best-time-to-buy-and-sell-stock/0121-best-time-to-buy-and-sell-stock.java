class Solution {
    public int maxProfit(int[] prices) {
      int maxprof=0;
      int min=prices[0];

      for(int i=0;i<prices.length;i++){
        maxprof=Math.max(maxprof,prices[i]-min);
        min=Math.min(min,prices[i]);

      } 
      return maxprof; 
    }
}