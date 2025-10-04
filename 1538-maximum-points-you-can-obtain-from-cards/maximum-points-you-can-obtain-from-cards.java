class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(cardPoints.length ==1){
            return cardPoints[0];
        }
        int end = cardPoints.length -1;
        int lsum = 0, rsum = 0, maxSum = 0;
        if(k==1){
            return Math.max(cardPoints[0], cardPoints[end]);
        }

        for(int i = 0;i < k;i++){
            rsum = rsum + cardPoints[i];
        }

        if(cardPoints.length == k){
            return rsum;
        }
        maxSum = rsum;
        for(int i = k-1; i>= 0; i--){
            rsum = rsum - cardPoints[i];
            lsum = lsum + cardPoints[end];
            end--;
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        return maxSum;
    }
}