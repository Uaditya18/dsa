class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        
        int buyingPrice  = prices[0];
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++){
            if(prices[i]<buyingPrice){
                buyingPrice = prices[i];
            }
            else if(prices[i]-buyingPrice>maxProfit){
                maxProfit = prices[i]-buyingPrice;
            }
        }

        return maxProfit;

    }
}