class Solution {
    public String countAndSay(int n) {
        String str = "1";
        if(n==1)
            return str;
        else
        {
            while(n>1)
            {
                String result = "";
                char[] arr = str.toCharArray();
                int i=0;
                while(i<arr.length)
                {
                    char c = arr[i];
                    int count = 0;
                    while(i<arr.length && arr[i]==c)
                    {
                        count++;
                        i++;
                    }
                    //System.out.println(str+" " +count+" "+c);
                    result =result + Integer.toString(count)+Character.toString(c);
                }
                str = result;
                n--;
            }
            return str;
        }
    }
}