class Solution {
    HashMap<Integer,String> hm = new HashMap<>();
    public String intToRoman(int num) {
        
        hm.put(1,"I");
        hm.put(4,"IV");
        hm.put(5,"V");
        hm.put(9,"IX");
        hm.put(10,"X");
        hm.put(40,"XL");
        hm.put(50,"L");
        hm.put(90,"XC");
        hm.put(100,"C");
        hm.put(400,"CD");
        hm.put(500,"D");
        hm.put(900,"CM");
        hm.put(1000,"M");
        int counter = 0;
        String result = "";
        while(num>0)
        {
            int val = (num%10) * (int)Math.pow(10,counter);
            counter++;
            if(hm.containsKey(val))
            {
                result = hm.get(val)+result;
            }
            else
                result = getvalue(val)+result;
            num/=10;
        }
        return result;
    }
    
    public String sub(int val,int num)
    {
        String result= "";
        for(int i=0;i<val;i++)
            {
                result+=hm.get(num);
            }
        return result;
    }
    
    public String getvalue(int val)
    {
        if(val==0)
            return "";
        String result = "";
        if(val>1 && val<4)
        {
            return sub(val,1);
        }
        else if(val>5 && val<9)
        {
            result = hm.get(5)+sub(val-5,1);
        }
        else if(val>10 && val<40)
        {
            result = sub(val/10,10);
        }
        else if(val>50 && val<90)
        {
            result = hm.get(50)+sub((val-50)/10,10);
        }
        else if(val>100 && val<400)
        {
            result = sub(val/100,100);
        }
        else if(val>500 && val<900)
        {
            result = hm.get(500)+sub((val-500)/100,100);
        }
        else if(val>1000)
        {
            result = sub(val/1000,1000);
        }
        return result;
    }
}