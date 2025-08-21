class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1){
            return intervals;
        }
        ArrayList<int[]> mergedInterval = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // it will take O(n)

        int start = intervals[0][0];
        int end = intervals[0][1];
        int n = intervals.length;
        //O(n)
        for(int i=1;i<n;i++){
            int firstElement = intervals[i][0];
            int lastElement = intervals[i][1];
            if(start<=firstElement && firstElement<=end){
                end = Math.max(lastElement, end);
            } else{
                mergedInterval.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        if(start <= intervals[n-1][0] && intervals[n-1][0] <= end){
            mergedInterval.add(new int[]{start, Math.max(end,intervals[n-1][1])});
        } else{
            mergedInterval.add(intervals[n-1]);
        }

        return mergedInterval.toArray(new int[mergedInterval.size()][]);
    }
}