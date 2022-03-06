class Trie {

    
    class TreeNode{
        char c;
        TreeNode[] child = new TreeNode[26];
        TreeNode(char c){
            this.c = c;
        }
        boolean isWord = false;
    }
    
    TreeNode root;
    public Trie() {
        root = new TreeNode(' ');
    }
    
    public void insert(String word) {
        TreeNode curr = root;
        for(int i=0;i<word.length();i++)
        {
            int val = word.charAt(i)-'a';
            if(curr.child[val]!=null)
                curr = curr.child[val];
            else
            {
                curr.child[val] = new TreeNode(word.charAt(i));
                curr = curr.child[val];
            }
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        TreeNode curr = root;
        for(int i=0;i<word.length();i++)
        {
            int val = word.charAt(i)-'a';
            if(curr.child[val]==null)
                return false;
            curr = curr.child[val];
        }
        return curr.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TreeNode curr = root;
        for(int i=0;i<prefix.length();i++)
        {
            int val = prefix.charAt(i)-'a';
            if(curr.child[val]==null)
                return false;
            curr = curr.child[val];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */