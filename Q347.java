class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numsF = new HashMap<>();
        for(int i : nums){
            if(numsF.containsKey(i)){
                numsF.put(i,numsF.get(i)+1);
            } else {
                numsF.put(i,1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return numsF.get(i2) - numsF.get(i1);
            }
        });
        
        for(int i: numsF.keySet()){
            pq.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for(int o = 0; o < k;o++){
            result.add(pq.poll());
        }
        return result;   
    }
}
