class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();

        if(m < n) return new ArrayList<>();

        List<Integer> result  = new ArrayList<>();

        int[] pFreq = new int[26];
        for(char c: p.toCharArray()){
            pFreq[c-'a']++;
        }

        int[] sFreq = new int[26];
        //create window
        int left = 0;
        for(int right = 0 ; right < n ; right++){
            char c = s.charAt(right);
            sFreq[c-'a']++;
        }

        if(isValidWindow(sFreq,pFreq,p)) result.add(left);
    
        for(int right = n ; right < m && left < right; right++){
            sFreq[s.charAt(left++)-'a']--;
            sFreq[s.charAt(right)-'a']++;
            if(isValidWindow(sFreq,pFreq,p)) result.add(left);
        }

        return result;
    }

    private static boolean isValidWindow(int[] sFreq, int[] pFreq, String p){
        
        for(char c : p.toCharArray()){
            if(sFreq[c-'a'] != pFreq[c-'a']) return false;
        }

        return true;
    }
}