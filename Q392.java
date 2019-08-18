class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        return isSub(s,t);
    }
    public boolean isSub(String s, String t){
        System.out.println("s: " + s + " t: "+ t);
        if(s.length() == 0){
            return true;
        }
        int curPos = -2;
        curPos = t.indexOf(s.charAt(0));
        if(curPos == -1){
            return false;
        }
        return isSub(s.substring(1),t.substring(curPos+1));
        }
    }
