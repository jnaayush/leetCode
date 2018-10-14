class Solution {
    public boolean isPowerOfTwo(int n) {
        int hammingWeight = 0;
        if(n == 0){
            return false;
        }
        while(n > 0){
            if(n % 2 == 1){
               hammingWeight = hammingWeight + 1;
                n = n / 2;
            }
            else {
                n = n / 2;
            }
            
        }
        
        if(hammingWeight == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
