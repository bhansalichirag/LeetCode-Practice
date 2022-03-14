class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("[/]");
        String ret = "/";
        LinkedList<String> que = new LinkedList<>();
        for(String str : parts)
        {
            if(!str.equals("..") && !str.equals(".") && str.length()>0)
                que.add(str);
            else if(str.equals("..") && que.size()>0)
                que.removeLast();
            //System.out.println(str+" "+que);
        }
        while(!que.isEmpty())
            ret+=que.remove()+"/";
        if(ret.length()==1)
            return ret;
        return ret.substring(0,ret.length()-1);
    }
}