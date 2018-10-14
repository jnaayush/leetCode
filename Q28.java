class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        int len_needle = needle.length();
        int len = haystack.length();
        int i = 0;
        boolean found = false;
        while(i < len){
            if(i+len_needle - 1 < len && needle.equals(haystack.substring(i,i+len_needle))){
                found = true;
                break;
            }
            ++i;
        }
        if(found){
            return i;
        } else{
            return -1;
        }
    }
}
