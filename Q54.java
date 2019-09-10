class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0){
            return res;
        }
        int dir = 0;
        int T = 0, B = matrix.length -1 , L = 0, R = matrix[0].length - 1;
        while(T <= B && L <= R){
            switch(dir){
                case 0:
                    for(int i = L; i <= R; i++){
                        res.add(matrix[T][i]);
                    }
                    T++;
                    dir++;
                    dir = dir%4;
                    break;
                case 1:
                    for(int i = T; i <= B; i++){
                        res.add(matrix[i][R]);
                    }
                    R--;
                    dir++;
                    dir = dir%4;
                    break;
                case 2:
                    for(int i = R; i >= L; i--){
                        res.add(matrix[B][i]);
                    }
                    B--;
                    dir++;
                    dir = dir%4;
                    break;
                case 3:
                for(int i = B; i >= T; i--){
                        res.add(matrix[i][L]);
                    }
                    L++;
                    dir++;
                    dir = dir%4;
                    break;
            }
        }      
        return res;
    }
}
