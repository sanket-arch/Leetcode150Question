class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        if(s.length() == 2){
           return s.charAt(0) == s.charAt(1) ? 1 : 2;
        }

        int i =0, j= 1;
        int n = s.length();
        int maxLen = 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(i),0);
        while(j<n){
            //move left pointer to next to the last seen position
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j))+1);
            }
            
            //update the last seen position of current chacrter
            map.put(s.charAt(j), j);
            maxLen = Math.max(j-i+1, maxLen);
            j++;
        }
        return maxLen;
    }
}