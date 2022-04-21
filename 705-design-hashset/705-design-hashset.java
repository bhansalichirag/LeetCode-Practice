class MyHashSet {

    List<Integer> li = new ArrayList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(!li.contains(key))
            li.add(key);
    }
    
    public void remove(int key) {
        li.remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        return li.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */