class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() ==0 && t.length() == 0) return true;
        if(t.length() == 0) return false;
        
        int i = 0;
        int j = 0;

        while(i<s.length()){
            while(j<t.length()){
                //System.out.println("i:"+i+" j:"+j+" Comparing:"+s.charAt(i)+"|"+t.charAt(j));
                if(s.charAt(i)==t.charAt(j)){
                    j++;
                    break;
                }
                else{
                    j++;
                }
                if(j==t.length()) return false;
            }
            if(i<s.length()-1 && j>=t.length()){
                return false;
            }
            i++;
        }

        return true;
    }
}