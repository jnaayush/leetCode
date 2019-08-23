class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length();
        char charArr[] = new char[r];
        for(char c : s.toCharArray()){
            c = Character.toLowerCase(c);
            if((c <= 'z' && c >= 'a') || (c>= '0' && c<= '9')) {
                charArr[l] = c;
                l++;
            }
        }
        l--;
        int i = 0;
        while(i < l){
            if(charArr[i] != charArr[l]){
                return false;
            }
            i++;
            l--;
        }
        return true;
    }
}
