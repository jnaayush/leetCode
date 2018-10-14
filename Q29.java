class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1 ){
            return 2147483647;
        }
        if(dividend == 0){
            return 0;
        }
        int sign = 1;
        if(divisor < 0){
            divisor = -divisor;
            sign = -1 * sign;
        }
        
        if(dividend < 0){
            dividend = -dividend;
            sign = -1 * sign;
        }
        int i = 0;
        while(dividend-divisor >= 0){
            dividend = dividend - divisor;
            i++;    
        }
        return sign * i;
    }
}
