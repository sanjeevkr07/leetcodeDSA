class Solution {
    public int longestPalindrome(String s) {
        
        int[] freq = new int[128];

        for(char c : s.toCharArray()){
            freq[c]++;
        }
        boolean isOddPresent = false;
        int count = 0;
        for(int i : freq){
            if(i % 2 !=0) isOddPresent = true;
            count+=(i/2)* 2;
        }
        return isOddPresent ? count+1 : count;
    }
}