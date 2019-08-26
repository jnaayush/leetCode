class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int lisCount[] = new int[nums.length];
        for(int i = 0; i < len; i++){
            lisCount[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    lisCount[i] = Math.max(lisCount[j]+1,lisCount[i]);
                }
            }
        }
        int ret = 0;
        for(int c : lisCount){
            if (ret < c){
                ret = c;
            }
        }
        return ret;
    }
}
