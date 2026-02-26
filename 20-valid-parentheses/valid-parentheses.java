import java.util.function.Predicate;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Predicate<Character> closing = c-> c==']' || c==')' || c == '}';
        int[] closingArr = {'}',']',')'};
        int[] openingArr = {'{','[','('};
        for(char c: s.toCharArray()){
            if(closing.test(c) && !st.isEmpty()){
                char ch = st.peek();
                if( (c==closingArr[0] && ch==openingArr[0]) ||
                    (c==closingArr[1] && ch==openingArr[1]) ||
                    (c==closingArr[2] && ch==openingArr[2])    ) st.pop();
                    
                else return false;
            }else if(closing.test(c) && st.isEmpty()){
                return false;
            }
            else{
                st.push(c);
            }
        }

        return st.isEmpty();
        
    }
}