class Solution {
    public boolean judgeCircle(String moves) {
        int h = 0;
        int v = 0;
        char charArr[] = moves.toCharArray(); 
        
        for(int i = 0; i < moves.length(); i++){
            switch(charArr[i]){
                case 'U':
                    v++;
                    break;
                case 'D':
                    v--;
                    break;
                case 'L':
                    h--;
                    break;
                case 'R':
                    h++;
                    break;
                default:
                    break;
            }
        }
        if(h == 0 && v ==0){
            return true;
        }
        return false;
    }
}
