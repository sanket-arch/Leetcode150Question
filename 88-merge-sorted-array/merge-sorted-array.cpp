class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(n==0) return ;

        if(m==0) nums1=nums2;

        int i=m-1;
        int j=n-1;
        int pos=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[pos]=nums1[i];
                i--;
            }else{
                nums1[pos]=nums2[j];
                j--;
            }
            pos--;
        }
        for(int i=j;i>=0;i--){
            nums1[pos]=nums2[i];
            pos--;
        }
    }
};