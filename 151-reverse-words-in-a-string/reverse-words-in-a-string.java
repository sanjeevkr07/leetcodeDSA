class Solution {
    public String reverseWords(String s) {
        
        // String[] words = s.trim().split(" ");

        // StringBuilder sb = new StringBuilder();
        // for(int i = words.length-1 ; i >=0 ; i--){

        //         sb.append(words[i]);
        //         if(i != 0) sb.append(" ");
        // }

        Stack<String> wordStack = new Stack();
        int i = 0;
        StringBuilder word = new StringBuilder();
        s = s.trim();
        while(i<s.length()){
            if(i == s.length()-1) {
                word.append(s.charAt(i));
                wordStack.push(word.toString());
            }
            if(s.charAt(i) == ' '){
                
                if(word.length() == 0){
                    i++;
                    continue;
                }
                else{
                    wordStack.push(word.toString());
                    word.replace(0,word.length(),"");
                }
            }
            else{
                word.append(s.charAt(i));
            }
            i++;
            
        }
        System.out.print(wordStack.toString());
        word.replace(0,word.length(),"");
        while(!wordStack.isEmpty()){
            word.append(wordStack.pop());
            word.append(" ");
        }
        return word.toString().trim();
    }
}