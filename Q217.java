class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(numsMap.containsKey(nums[i])){
                return true;
            }else{
                numsMap.put(nums[i],1);
            }
        }
        return false;
    }
}
