class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int target = -(nums[i]);
            for(int j = i+1; j<n; j++){
                int diff = target - nums[j];
                if(mpp.get(diff) != null && mpp.get(diff) != i){
                    List<Integer> triplet = Arrays.asList(nums[i],diff,nums[j]);
                    Collections.sort(triplet); // sorting to make sure even if we get duplicates after sorting when we store in set it always be unique
                    set.add(triplet);
                }
                mpp.put(nums[j], j);
            }
            mpp.clear(); // clearing the set so that we only add the data which is between starting and and second pointer
        }
        return new ArrayList<>(set);
    }
}