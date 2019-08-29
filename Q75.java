class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int twos = nums.length - 1;
        int cur = 0;
        while(cur <= twos){
            if(nums[cur] == 0){
                swap(nums,zeros,cur);
                zeros++;
                cur++;
            } else if(nums[cur] == 2){
                swap(nums,twos,cur);
                twos--;
            } else {
                cur++;
            }
        }
        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
