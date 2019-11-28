class MyHashSet {
public:
    /** Initialize your data structure here. */
    int size;
    vector<vector<int>> v;
    MyHashSet() {
        size = 1000;
        v = vector(1000 , vector<int> (0,0));  
    }
    
    void add(int key) {
        if(!contains(key))
            v[hash(key)].push_back(key);
    }
    
    void remove(int key) {
        vector<int> &el = v[hash(key)];
        for(int i = 0; i < el.size(); i++){
            if(el[i] == key){
                el.erase(el.begin() + i);
            }
        }
    }
    
    /** Returns true if this set contains the specified element */
    bool contains(int key) {
        vector el = v[hash(key)];
        for(int i = 0; i < el.size(); i++){
            if(el[i] == key){
                return true;
            }
        }
        return false;
    }
    
    int hash(int key){
        return key % size;
    }
};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */
