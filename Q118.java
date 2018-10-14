class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        if(numRows == 0){
            return new ArrayList();
        }
        List<Integer> row1 = new ArrayList();
        row1.add(1);
        result.add(row1);
        for(int i = 1; i < numRows; i++){
            List<Integer> row = new ArrayList();
            for(int j = 0; j <= i; j++){
                if(i != 0){
                    row.add(getInt(result.get(i-1),i,j));
                }
            }
            result.add(row);
        }
        return result;
    }
    
    private int getInt(List<Integer> prevRow,int n, int r){
        if(n == 0){
            return 1;
        }
        if(r == 0 || n == r){
            return 1;
        }
        else{
            return prevRow.get(r-1) + prevRow.get(r);        
        }   
    }
}
