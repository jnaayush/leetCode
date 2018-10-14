class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(!numMap.containsKey(nums[i])){
                numMap.put(nums[i],0);
            }else{
                numMap.put(nums[i], numMap.get(nums[i]) + 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
             if(entry.getValue() == 0)
                 return entry.getKey();
        }
        return 0;
    }
}
