class Solution {
    private static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c =='A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        
        Stack<Character> st = new Stack<>();

        StringBuilder str = new StringBuilder(s);

        for(char c: s.toCharArray()){
            if(isVowel(c)) st.push(c);
        }

        for(int i = 0; i<s.length() ; i++){
            if(isVowel(s.charAt(i)))
                str.setCharAt(i,st.pop());
        }
        
        return str.toString();
    }
}