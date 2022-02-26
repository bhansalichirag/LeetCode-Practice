class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c : arr)
        {
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            else
            {
                if(c==')' && st.size()>=1 && st.peek()=='(')
                    st.pop();
                else if(c=='}' && st.size()>=1 && st.peek()=='{')
                    st.pop();
                else if(c==']' && st.size()>=1 && st.peek()=='[')
                    st.pop();
                else
                    return false;
            }
        }
        return st.size()==0;
    }
}