class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        
        int n = s.length();

        int maxLen = 0;

        Set<Character> set = new HashSet<>();

        for(int right = 0 ; right < n ; right++){
            
            Character curr = s.charAt(right);

            while(set.contains(curr)){
                set.remove(s.charAt(left++));
            }
            set.add(curr);

            maxLen = Math.max(maxLen,right-left+1);

        }

        return maxLen;

    }
}