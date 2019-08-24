class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return 0;
        }
        if(len == 2){
            if(nums[0] > nums[1]){
                return 0;
            } else {
                return 1;
            }
        }
        if(len >= 3){
            for(int i = 1; i < len-1; i++){
                if(nums[i-1] < nums[i] && nums[i] > nums[i+1]){
                    return i;
                }
            }
        }
        if(nums[len-2] < nums[len-1]) {
            return len-1;
        }
        if (nums[0] > nums[1]){
            return 0;
        }
        
        return -1;
        
    }
}
