class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowZ = new HashSet<>();
        Set<Integer> colZ = new HashSet<>();
        for(int m = 0; m < matrix.length; m++){
            for(int n = 0; n < matrix[m].length;n++){
                if(matrix[m][n] == 0){
                    rowZ.add(m);
                    colZ.add(n);
                }
            }
        }

        for(int r : rowZ){
            for(int j = 0; j < matrix[r].length; j++){
                matrix[r][j] = 0;
            }
        }
        for(int c : colZ){
            for(int j = 0; j < matrix.length; j++){
                matrix[j][c] = 0;
            }
        }
    }
}
