class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int max = -1;
        for(int i = 0; i < len; i++){
            sum = sum + nums[i];
            max = Math.max(max, nums[i]);
        }
        max = Math.max(max, len);
        return (max * (max + 1) /2) - sum;
    }
}
