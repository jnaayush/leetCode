class Solution {
    public int uniquePaths(int m, int n) {
        int steps[][] = new int[m][n];
        steps[0][0] = 1;
        getSteps(m,n,steps);
        for(int l = 0; l < steps[0].length; l++){
            for(int k = 0; k < steps.length; k++){
                System.out.print(steps[k][l] + " ");
            }
            System.out.println(" ");
        }
        return steps[m-1][n-1];
    }
    
    public void getSteps(int i, int j, int[][] steps){
        for(int m = 0; m < steps.length; m++){
            for(int n = 0; n < steps[0].length; n++){
                if(m == 0 && n == 0) continue;
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
