class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_count = 0;
        int zero_count =0;
        int zero_idx = 0, start =0, end = 0;
        while(start<= end && end < nums.length){
            if(nums[end] == 0) {
                zero_count++;
            }

            if(zero_count <= k ){
                max_count = Math.max(end - start + 1, max_count);
            } else if(zero_count > k){
                if(nums[start]==0){
                    zero_count--;
                }
                start++;
            }
            end++;
        }

        return max_count;
    }
}