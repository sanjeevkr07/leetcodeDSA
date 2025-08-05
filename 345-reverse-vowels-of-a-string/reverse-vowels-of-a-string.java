class Solution {
    private static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c =='A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);

        int i=0;
        int j=s.length()-1;

        while(i<j){


            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                char temp = s.charAt(i);
                str.setCharAt(i++,s.charAt(j));
                str.setCharAt(j--,temp);
                
            }

            if(!isVowel(s.charAt(i))) i++;
            if(!isVowel(s.charAt(j))) j--;
        }

        return str.toString();
    }
}