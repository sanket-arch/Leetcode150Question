class Solution {
    public int candy(int[] ratings) {
        int sum = 1;
        int size = ratings.length;
        int i =1;
        while(i<size){

            //if flat
            if( ratings[i] == ratings[i-1]){
                sum = sum + 1;
                i++; 
                continue;
            }

            //calculating while increasing slope
            int peak = 1;
            while(i<size && ratings[i] > ratings[i-1]){
                peak = peak+1;
                sum = sum + peak;
                i++;
            }

            //calculating while decreasing slope
            int down = 1;
            while(i < size && ratings[i] < ratings[i-1]){
                sum = sum + down;
                down = down +1 ;
                i++;
            }

            if(down > peak){
                sum  = sum + (down - peak);
            }
        }

        return sum;
    }
}