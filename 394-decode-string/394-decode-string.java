class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c : arr)
        {
            if(c!=']')
            {
                st.push(Character.toString(c));
            }
            else
            {
                String temp = "";
                while(!st.isEmpty() && !st.peek().equals("["))
                {
                    String val = st.pop();
                    temp = val + temp;
                }
                st.pop();
                String tem_num = "";
                while(!st.isEmpty() && (st.peek().charAt(0))-'0'>=0 && (st.peek().charAt(0))-'0'<=9)
                {
                    String val1 = st.pop();
                    tem_num = val1 + tem_num;
                }
                int num = Integer.valueOf(tem_num);
                String ret = "";
                for(int i=0;i<num;i++)
                    ret+=temp;
                st.push(ret);
            }
        }
        String result = "";
        while(!st.isEmpty())
            result = st.pop() + result;
        return result;
    }
}