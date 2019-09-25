class LRUCache {
    
    class DNode{
        int val;
        int key;
        DNode next;
        DNode prev;
        
        public DNode(int key,int val){
            this.val = val;
            this.key = key;
            this.next = null;
            this.prev = null;
        }
    }
    
    Map<Integer, DNode> LRUMap;
    int capacity = 0;
    int size = 0;
    DNode head;
    DNode tail;
    
    private void addToFront(DNode tmp){
        tmp.prev = head;
        tmp.next = head.next;
        head.next.prev = tmp;
        head.next = tmp;
    }
    
    private void removeNode(DNode tmp){
        tmp.next.prev = tmp.prev;
        tmp.prev.next = tmp.next;
    }
    
    
    private void removeLast(){
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        LRUMap = new HashMap<>();
        this.head = new DNode(-1,-1);
        this.tail = new DNode(-1,-1);
        tail.prev = head;
        head.next = tail;
    }
    
    public int get(int key) {
        if(!LRUMap.containsKey(key)){
            return -1;
        } else {
            DNode tmp = LRUMap.get(key);
            if(tmp.prev == head){
                return tmp.val;
            } else {
                removeNode(tmp);
                addToFront(tmp);
            }
            return tmp.val;
        }
    }
    
    public void put(int key, int value) {
        System.out.println(size);
        if(LRUMap.containsKey(key)){
            DNode tmp = LRUMap.get(key);
            tmp.val = value;
            removeNode(tmp);
            addToFront(tmp);
            return;
        }
        
        if(size < capacity){
            DNode tmp = new DNode(key,value);
            addToFront(tmp);
            LRUMap.put(key,tmp);
            size  += 1;
            
        } else {
            int keyR = tail.prev.key;
            removeLast();
            LRUMap.remove(keyR);
            
            DNode tmp = new DNode(key, value);
            addToFront(tmp);
            LRUMap.put(key,tmp);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
