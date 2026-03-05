class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();

        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        boolean isOddPresent = false;
        int count = 0;
        for(char c : mp.keySet()){
            if(mp.get(c) % 2 !=0) isOddPresent = true;
            count+=(mp.get(c)/2)* 2;
        }
        return isOddPresent ? count+1 : count;
    }
}