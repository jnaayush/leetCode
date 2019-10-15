class Solution {
    public int[][] transpose(int[][] A) {
        if(A.length == A[0].length){
            int temp;
            for(int i = 0; i < A.length; i++){
                for(int j = i; j < A.length; j++){
                    temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
            return A;
        } else {
            int[][] B = new int[A[0].length][A.length];
            for(int i = 0; i < A.length; i++){
                for(int j = 0; j < A[0].length; j++){
                    B[j][i] = A[i][j];
                }
            }
            A = B;
        }
        return A;
    }
}
