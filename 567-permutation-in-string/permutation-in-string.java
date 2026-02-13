class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;
        
        int[] s1Freq = new int[26];

        for(char c : s1.toCharArray()){
            s1Freq[c-'a']++;
        }

        int left = 0;

        int[] s2Freq = new int[26];

        for(int right = 0 ; right < s1.length() ; right++){
            s2Freq[s2.charAt(right)-'a']++;
        }

        if(isValidWindow(s1Freq,s2Freq,s1)) return true;
        
        for(int right = s1.length() ; right < s2.length() && left < right ; right++){
            
            s2Freq[s2.charAt(left++)-'a']--;
            s2Freq[s2.charAt(right)-'a']++;

            if(isValidWindow(s1Freq,s2Freq,s1)) return true;

            

        }
        return false;
    }

    private static boolean isValidWindow(int[] s1Freq,int[] s2Freq,String s1){

        for(char c: s1.toCharArray()){
            if(s1Freq[c-'a'] != s2Freq[c-'a']) return false;
        }

        return true;
    }
}