class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1;
        int len = digits.length;
        int[] result = new int[len];
        
        for(int i = len - 1 ; i  >= 0 ; --i){
            result[i] = digits[i] + carry;
            carry = result[i]/10;
            result[i] = result[i] % 10;
        }
        int[] result1 = {0};
        if(carry != 0){
            result1 = new int[len + 1];
            for(int i = 0; i <= len - 1; ++i){
                result1[i+1] = result[i];
            }
            result1[0] = carry;
            return result1;
        }
        return result;
    }
}
