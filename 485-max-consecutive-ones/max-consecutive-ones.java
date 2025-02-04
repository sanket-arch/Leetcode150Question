class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=Integer.MIN_VALUE;
        int consCount=0;
        for(int num:nums){
            if(num == 0){
                maxCount = Math.max(maxCount,consCount);
                consCount =0;
            }else{
                consCount++;
            }
        }

        return Math.max(consCount,maxCount);
    }
}