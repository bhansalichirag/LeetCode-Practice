class Solution {
    List<List<Integer>> resu = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        getcombo(candidates,target,0,new ArrayList<>());
        return resu;
    }
    
    public void getcombo(int[] candidates,int target,int sum,List<Integer> li)
    {
        if(sum>target)
            return;
        else if(sum==target)
        {
            Collections.sort(li);
            if(!resu.contains((li)))
                resu.add(new ArrayList<>(li));
            return;
        }
        else{
            for(int i=0;i<candidates.length;i++)
        {
            if(candidates[i]+sum<=target)
            {
                li.add(candidates[i]);
                sum+=candidates[i];
                getcombo(candidates,target,sum,new ArrayList<>(li));
                sum-=candidates[i];
                li.remove(li.size()-1);
                //System.out.println(li+"  "+sum);
            }
        }
        }
        
    }
}