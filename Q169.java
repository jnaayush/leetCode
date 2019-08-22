class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        int i = 0;
        while(i < len){
            int cur = nums[i];
            if((i+len/2) < len && nums[i+(len/2)] == cur){
                return nums[i];
            }
            i++;
        }
        return 0;
    }
}
