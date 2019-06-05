class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        int l = 0; 
        int r = nums.length - 1;
        int maxIndex = -1;
        int minIndex = -1;
        int m = 0;
        
        while(l <= r){
            m = (l+r)/2;
            if(nums[m] == target){
                minIndex = m;
                r = m - 1;
            } else if(nums[m] < target){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        l = 0;
        r = nums.length - 1;
        while(l <= r){
            m = (l+r)/2;
            if(nums[m] == target){
                maxIndex = m;
                l = m + 1;
            } else if(nums[m] < target){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        result[0] = minIndex;
        result[1] = maxIndex;
        
        return result;
    }
}
