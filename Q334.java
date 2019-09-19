class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int n : nums){
            if(n <= min){
                min = n;
            } else if (n < min2){
                min2 = n;
            } else if (n > min2){
                return true;
            }
        }
        return false;
    }
}
