class Solution {
    public void gameOfLife(int[][] board) {
        int [][] temp = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                int n =  neighbour(i,j,board);
                if(board[i][j] == 1){
                    if(n < 2){
                        temp[i][j] = 0;
                    }
                    if (n == 2 || n == 3){
                         temp[i][j] = 1;
                    }
                    if (n > 3){
                        temp[i][j] = 0;
                    }
                } else if (n == 3){
                    temp[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j]  = temp[i][j];
            }
        }
    }
    
    public int neighbour(int i, int j, int[][] board){
        int count = 0;
        if(i-1 >= 0 && j-1 >= 0){
            count += board[i-1][j-1];
        }
        if(i+1 < board.length && j+1 < board[0].length){
            count += board[i+1][j+1];
        }
        if(i+1 < board.length){
            count += board[i+1][j];
        }
        if(j+1 < board[0].length){
            count += board[i][j+1];
        }
        if(i-1 >= 0){
            count += board[i-1][j];
        }
        if(j-1 >= 0){
            count += board[i][j-1];
        }
        if(i-1 >= 0 && j+1 < board[0].length){
            count += board[i-1][j+1];
        }
        if(i+1 < board.length && j-1 >= 0){
            count += board[i+1][j-1];
        }
        return count;
    }
}
