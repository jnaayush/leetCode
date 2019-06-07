class Solution {
    public void reverseString(char[] s) {
        int len = s.length-1;
        if(s.length == 0){
            return;
        }
        for(int i = 0; i < len/2+1; i++){
            char tmp = s[i];
            s[i] = s[len-i];
            s[len-i] = tmp;
        }
    }
}
