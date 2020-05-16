class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> result;
        result = genCurRow(rowIndex+1);
        return result;
    }
    
    vector<int> genCurRow(int rowIdx){
        if(rowIdx == 1){
            vector<int> a{1};
            return (a);
        } else if (rowIdx == 2) {
            vector <int> a{1,1};
            return (a);
        } else {
            vector<int> prevRow = genCurRow(rowIdx - 1);
            vector<int> curRow(prevRow.size() + 1);
            curRow[0] = 1;
            curRow[prevRow.size()] = 1;
            for(int i = 0; i < prevRow.size() - 1 ; i++){
                curRow[i+1] = prevRow[i] + prevRow[i+1];
            }
            return curRow;
        }
    }
};
