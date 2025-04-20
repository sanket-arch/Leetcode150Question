class Solution {
    public int candy(int[] ratings) {
        int size= ratings.length;
         int[] left = new int[size];
        left[0] = 1;
        for(int i =1;i < size; i++){
            if(ratings[i]> ratings[i-1]){
                left[i] = left[i-1]+1;
            }else{
                left[i]=1;
            }
        }

        int sum = Math.max(left[size-1], 1);
        int curr = 1, right = 1;

        for(int i= size-2; i>=0;i--){
            if(ratings[i]> ratings[i+1]){
                curr = right+1;
            } else{
                curr = 1;
            }
            right = curr;

            sum =sum + Math.max(left[i], curr);
        }

        return sum;
    }
}