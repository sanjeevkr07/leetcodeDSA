import java.util.function.Predicate;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Predicate<Character> closing = c-> c==']' || c==')' || c == '}';
        // int[] closingArr = {'}',']',')'};
        // int[] openingArr = {'{','[','('};
        for(char c: s.toCharArray()){
            if(closing.test(c) && !st.isEmpty()){
                char ch = st.peek();
                char top = st.peek();

                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    st.pop();
                    }      
                else return false;
            }
            else{
                st.push(c);
            }
        }

        return st.isEmpty();
        
    }
}