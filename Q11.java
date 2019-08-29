class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int length = 0;
        int ht = 0;
        int maxArea = 0;
        
        while(left < right){
            length = right - left;
            ht = Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea, length * ht);
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
        
    }
}
