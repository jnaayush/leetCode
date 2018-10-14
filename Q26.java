class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int last = 1;
        for(int i = 0; i < (nums.length - 1); ++i){
            if(nums[i] != nums[i+1]){
                nums[last] = nums[i+1];
                ++last;
            }
        }
        return last;
    }
}
