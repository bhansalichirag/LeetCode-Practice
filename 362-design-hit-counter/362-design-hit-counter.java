class HitCounter {

    HashMap<Integer,Integer> hm = new HashMap<>();
    public HitCounter() {
        
    }
    
    public void hit(int timestamp) {
        hm.put(timestamp,hm.getOrDefault(timestamp,0)+1);
    }
    
    public int getHits(int timestamp) {
        int min = Math.max(0,timestamp-300);
        int result = 0;
        for(int i=min+1;i<=timestamp;i++)
        {
            result+=hm.getOrDefault(i,0);
        }
        return result;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */