class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
       if(k%n==0) {
           return;
       }
       //if k is greater than n than we only have to the remainder when size is divided. becoz rotating the array n time gives the same array
       if(k>n){
           k=k%n;
       }
        reverse(nums.begin(),nums.end()-k);
        reverse(nums.end()-k,nums.end());

        reverse(nums.begin(),nums.end());
    }
};