class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] left = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i -1] * nums[i-1] ;
        }
        
        int[] result = new int[nums.length]; 
        int multiple = nums[nums.length -1];
        result[nums.length -1] = left[left.length -1];
        for(int i = nums.length-2 ; i >=0 ; i--){
            result[i] = multiple * left[i];
            multiple = multiple * nums[i];
        }

        return result;
    }
}