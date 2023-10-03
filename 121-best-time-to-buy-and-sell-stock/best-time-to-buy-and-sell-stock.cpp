class Solution {
public:
    int maxProfit(vector<int>& prices) {
       int n=prices.size();
       int mini=prices[0],maxProfit=0;
       int currProfit;
       for(int i=1;i<n;i++) {
           mini=min(mini,prices[i]);
            currProfit=prices[i]-mini;
            maxProfit=max(maxProfit,currProfit);
       }
       return maxProfit;
    }
};