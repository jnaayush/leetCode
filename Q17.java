class Solution {
    public List<String> letterCombinations(String digits) {
        String alphas[] = new String[digits.length()];
        List<String> str = new ArrayList<>();
        if(digits.length() == 0){
            return str;
        }
        for(int i = 0; i < digits.length();i++){
            alphas[i] = getAlphas(Character.getNumericValue(digits.charAt(i)));
        }
        getAlphaSet(alphas,str,"",digits.length(),0);
        return str;
    }
    
    public String getAlphas(int n){
        switch (n){
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return "";
        }
    }
    
    public void getAlphaSet(String[] alphas, List<String> str, String s,int n, int index){
        if(n == 0){
            str.add(s);
            return;
        }
        for(int i = 0; i < alphas[index].length(); i++){
            s = s + alphas[index].charAt(i);
            getAlphaSet(alphas,str,s,n-1,index+1);
            s = s.substring(0, s.length() - 1);
        }
    }
}
