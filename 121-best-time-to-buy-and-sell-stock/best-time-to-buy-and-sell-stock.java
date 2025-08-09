class Solution {
    public int maxProfit(int[] prices) {
                
        if(prices.length == 0){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices){
            if(price - minPrice > maxProfit){
                maxProfit = price-minPrice;
            } else if(price < minPrice) {
                minPrice = price;
            }
        }

        return maxProfit;
    }
}