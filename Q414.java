class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(3,Collections.reverseOrder());
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums){
            set.add(n);
        }
        for(int n : set){
            pq.add(n);
        }
        if(pq.size() > 2){
            for(int i = 0; i < 2; i++){
                pq.poll();
            }
        }
        return pq.poll();
    }
}
