class Solution {
    public int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int i = A.length - 1;
        int result[] = new int[A.length];
        while(left <= right){
            if(A[left] * A[left] > A[right] * A[right]){
                result[i] = A[left] * A[left];
                left++;
                i--;
            }else{
                result[i] = A[right] * A[right];
                right--;
                i--;
            }
        }
        return result;
    }
}
