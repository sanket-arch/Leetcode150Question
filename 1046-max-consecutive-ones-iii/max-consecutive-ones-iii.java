class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_count = 0;
        int zero_count =0;
        int zero_idx = 0, start =0, end = 0;
        while(end < nums.length){
            if(nums[end] == 0) {
                zero_count++;
            }

            while(zero_count > k){
                if(nums[start]==0){
                    zero_count--;
                }
                start++;
            }


            if(zero_count <= k ){
                max_count = Math.max(end - start + 1, max_count);
            } 
            end++;  
        }

        return max_count;
    }
}