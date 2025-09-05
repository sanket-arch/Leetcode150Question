import java.util.HashMap;
 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        map.put(nums[0],0);

        for(int i=1;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.get(diff) !=null){
                arr.add(map.get(diff));
                arr.add(i);
                break;
            }
            map.put(nums[i],i);
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}