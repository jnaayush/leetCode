public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int bitArray[] = new int[32];
        int r = 0;
        for(int i = 0; i < 32; i++){
            bitArray[i] = n&1;
            n = n >>> 1;
        }
        
        for(int i = 0; i <=31; i++){
            r |= (bitArray[i] & 1) << (31-i);
        }
    return r;
    }
    
}
