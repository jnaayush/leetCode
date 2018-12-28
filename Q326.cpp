class Solution {
public:
    bool isPowerOfThree(int n) {
        int powe = 1;
        while(1){
            if(n == powe){
                return true;
            }
            if(powe - n > 0){
                return false;
            }
            powe = powe * 3;
        }
    }
};
