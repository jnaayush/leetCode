class Solution {
    public boolean isHappy(int n) {
        int next_num = 0;
        int i = 0;
        while(n != 1){
            next_num = 0;
            i++;
            while(n != 0){
                int tmp;
                tmp = n % 10;
                n = n/10;
                next_num = next_num + (tmp * tmp);
            }
            n = next_num;
            if(i > 150){
                return false;
            }
        }
        return true;
    }
}
