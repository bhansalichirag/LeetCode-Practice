class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.length()<num2.length())
        {
            while(num1.length()!=num2.length())
                num1="0"+num1;
        }
        if(num2.length()<num1.length())
        {
            while(num2.length()!=num1.length())
                num2="0"+num2;
        }
        int carry = 0;
        int sum = 0;
        String result = "";
        for(int i=num2.length()-1;i>=0;i--)
        {
            sum = num1.charAt(i)-'0'+num2.charAt(i)-'0' + carry;
            carry = sum/10;
            sum%=10;
            result = Integer.toString(sum)+result;
        }
        if(carry!=0)
            result = Integer.toString(carry)+result;
        return result;
    }
}