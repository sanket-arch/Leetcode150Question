class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        if(n == 0){
            return;
        }

        int x = m-1;
        int y = n-1;
        int i = 0;
        if(x < 0){
            y=0;
            for( ;i < m+n; i++){
                nums1[i] = nums2[y];
                y++;
            }
            return;
        }

        i = (m+n)-1;
        for( ; i>=0;i--){
            if(y < 0 || x < 0){
                break;
            }

            if(nums2[y]> nums1[x]){
                nums1[i] = nums2[y];
                y--;
            } else {
                nums1[i] = nums1[x];
                x--;
            }
        }
        if(y >= 0){
            for(;i>=0;i--){
                nums1[i] = nums2[y];
                y--;
            }
        }
    }
}