class Solution {
public:
    int addDigits(int num) {
        while(num / 10 != 0){
            int digSum = 0;
            while(num != 0){
                digSum = digSum + num%10;
                num = num / 10;
            }
            num = digSum;
        }
        return num;
    }
};
