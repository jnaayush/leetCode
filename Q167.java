class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index = -1;
        int[] result = new int[2];
        int lIndex = numbers.length - 1;
        for(int i = 0; i <= lIndex - 1; i++){
            index = binarySearch(numbers,Math.abs(target-numbers[i]),i+1,lIndex);
            if(index != -1){
                result[0]=i+1;
                result[1]=index+1;
                break;
            }
        }
        return result;
    }
    private int binarySearch(int[] nums, int n, int l , int r){
        int mid = (l+r)/2;
        if(l > r){
            return -1;
        }
        if(n == nums[mid]){
            return mid;
        }else if(n > nums[mid]){
            l = mid + 1;
            return binarySearch(nums,n,l,r);
        } else {
            r = mid - 1;
            return binarySearch(nums,n,l,r);
        }
        
    }
}
