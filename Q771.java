class Solution {
    public int numJewelsInStones(String J, String S) {
        Map jewels = new HashMap<Character,String>();
        for(int i = 0; i < J.length(); i++){
            jewels.put(J.charAt(i), "");
        }
        int result = 0;
        for(int j = 0; j < S.length(); j++){
            if(jewels.containsKey(S.charAt(j))){
                result++;
            }
        }
        return result;
    }
}
