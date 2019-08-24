class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        genLR(res,"",n,n);
        return res;
    }
    
    public void genLR(List<String> res, String s, int left, int right){
        if(left == 0 && right == 0){
            res.add(s);
        }
        if(left > 0){
            genLR(res,s+"(",left-1,right);
        }
        if(left < right && right > 0){
            genLR(res, s+")",left,right-1);
        }
    }
}
