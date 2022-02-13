class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        li.add(new ArrayList<>());
        for(int i : nums)
        {
            getsubs(i);
        }
        return li;
    }
    
    public void getsubs(int i)
    {
        int size = li.size();
        for(int x = 0;x< size;x++)
        {
            List<Integer> qq = new ArrayList<>(li.get(x));
            qq.add(i);
            li.add(new ArrayList<>(qq));
        }
    }
}