class KthLargest {
private:
    priority_queue <int, vector<int>, greater<int>> pq;
    int k;
public:
    KthLargest(int k, vector<int>& nums) {
        this->k = k;
       for(auto n : nums){
           pq.push(n);
       }
        int size = pq.size();
        for(int i = 0; i < (size-k); i++){
            pq.pop();
        }
    }
    
    int add(int val) {
        pq.push(val);
        if(pq.size() > this->k){
            pq.pop();
        }
        return pq.top();
    }
    
};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */
