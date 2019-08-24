class Solution {
    public int uniquePaths(int m, int n) {
        int steps[][] = new int[m][n];
        getSteps(m,n,steps);
        return steps[m-1][n-1];
    }
    
    public void getSteps(int i, int j, int[][] steps){
        for(int m = 0; m < steps.length; m++){
            for(int n = 0; n < steps[0].length; n++){
                if(m == 0 || n == 0){
                    steps[m][n] = 1;
                    continue;
                };
                int left = 0;
                int up = 0;
                if(m >= 1)
                    left = steps[m-1][n];
                if(n >= 1)
                    up = steps[m][n-1];
                steps[m][n] = left + up;
            }
        }
    }
}

