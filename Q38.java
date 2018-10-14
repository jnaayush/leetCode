class Solution {
    int digits[] = new int[10000];
    
    public String countAndSay(int n) {
        String result;
        if( n == 1){
            return "1";
        }
        digits[0] = 1;
        for(int i = 2; i <= n; ++i){
            digits = read(digits);
        }
        
        result = toNumber(digits);
        return result;
        //return Integer.toString(result);
        //return Arrays.toString(digits);
    }
    
    private int[] read(int[] digits){
        int m = 0;
        int n = 1;
        int count = 1;
        int i = 0;
        int temp[] = new int[10000];
        while(digits[i+1] != 0){
            if(digits[i] != digits[i+1]){
                temp[m] = count;
                m = m + 2;
                temp[n] = digits[i];
                n = n + 2;
                count = 1;
            } else {
                count++;
            }
            i++;
        }
        temp[m] = count;
        temp[n] = digits[i];
        return temp;
    }

    private String toNumber(int[] digits){
        String result ="";
        for(int i = 0; digits[i] != 0; i++){
            result = result+""+Integer.toString(digits[i]);
        }
        return result;
    }
}
