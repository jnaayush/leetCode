class Solution {
    boolean found = false;
    boolean[][] seen;
    public boolean exist(char[][] board, String word) {
        char[] chr = word.toCharArray();
        List<int[]> start = locateStart(board, chr[0]);
        if(start.size() == 0){
            return false;
        }for(int[] s : start){
            char[][] boardCopy = new char[board.length][board[0].length];
            for(int y = 0; y < board[0].length; y++){
                for(int x = 0; x < board.length; x++){
                    boardCopy[x][y] = board[x][y];
                }
            }   
            dfs(boardCopy,chr,s,1);
        }
        return found;
    }
    
    public void dfs(char[][] board, char[] chr, int[] start, int curChar){
        if(curChar == chr.length){
            found = true;
            return;
        }
        List<int[]> nbrs = new ArrayList<>();
        getNBRS(board, start, nbrs);
        
        char tmp = board[start[0]][start[1]];
        board[start[0]][start[1]] = '0';
        for(int[] n : nbrs){
            if(board[n[0]][n[1]] == chr[curChar] && !found){
                dfs(board,chr,n,curChar+1);
            }
        } 
        board[start[0]][start[1]] = tmp;
    }

    private void getNBRS(char[][] board, int[] start, List<int[]> nbrs){
        int x = start[0];
        int y = start[1];
        if(y+1 < board[0].length && board[x][y+1] != '0'){
            nbrs.add(new int[] {x,y+1});
        }
        if(x+1 < board.length && board[x+1][y] != '0'){
            nbrs.add(new int[] {x+1,y});
        }
        if(x-1 >= 0 && board[x-1][y] != '0'){
            nbrs.add(new int[] {x-1,y});
        }
        if(y-1 >= 0 && board[x][y-1] != '0'){
            nbrs.add(new int[] {x,y-1});
        }
    }
    
    
    private List<int[]> locateStart(char[][] board, char s){
        List<int[]> res = new ArrayList<>();
        for(int y = 0; y < board[0].length; y++){
            for(int x = 0; x < board.length; x++){
                if(board[x][y] == s){
                    res.add(new int[] {x,y});
                }
            }
        }
        return res;
    }
}
