class Solution {
    public int firstUniqChar(String s) {
        int idxArr[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(idxArr[idx] > 0){
                idxArr[idx] = -1;
            } else if(idxArr[idx] < 0){
                continue;
            } else {
                idxArr[idx] = i+1;
            }
        }
        int min = s.length();
        boolean found = false;
        for(int j = 0; j < 26; j++){
            if(idxArr[j] > 0 && idxArr[j] <= min){
                min = idxArr[j];
                found = true;
            }
        }
        if(!found){
            return -1;
        }
        return min-1;
    }
}
