class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int y = 0;
        int x = matrix[0].length - 1;
        while(y < matrix.length && x >= 0){
            if(matrix[y][x] > target){
                x--;
            } else if (matrix[y][x] < target){
                y++;
            } else {
                return true;
            }
        }
        return false;
    }
}
