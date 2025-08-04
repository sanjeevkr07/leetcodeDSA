class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;

        int num = 0;
        StringBuilder str = new StringBuilder();

        while(i<word1.length() && j<word2.length()){
            if(num%2==0){
                str.append(word1.charAt(i++));
            }
            else{
                str.append(word2.charAt(j++));
            }
            num++;
        }

        while(i<word1.length()){
            str.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            str.append(word2.charAt(j++));
        }

        return str.toString();
    }
}