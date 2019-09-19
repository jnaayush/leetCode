class Trie {

    /** Initialize your data structure here. */
    
    public class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isWord  = false;
        
        TrieNode(){
            isWord = false;
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode crawl = root;
        for(int level = 0; level < word.length(); level++){
            char c = word.charAt(level);
            if (crawl.children[c-'a'] == null)
                crawl.children[c-'a'] = new TrieNode();
            crawl = crawl.children[c-'a'];
        }
        crawl.isWord = true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode crawl = root;
        for(int level = 0; level < word.length(); level++){
            char c = word.charAt(level);
            if(crawl.children[c-'a'] != null){
                crawl = crawl.children[c-'a'];
            } else {
                return false;
            }
        }
         return crawl.isWord;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode crawl = root;
        for(int level = 0; level < prefix.length(); level++){
            char c = prefix.charAt(level);
            if(crawl.children[c-'a'] != null){
                crawl = crawl.children[c-'a'];
            } else {
                return false;
            }
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
