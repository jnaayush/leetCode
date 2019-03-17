class Solution {
    public String addBinary(String a, String b) {
        boolean carry = false;
        int lenA = a.length();
        int lenB = b.length();
        String result = "";
        if(lenA < lenB){
            for(int j = 0; j < lenB - lenA; j++){
                a = "0" + a;
            }
        } else if (lenB < lenA){
             for(int j = 0; j < lenA - lenB; j++){
                b = "0" + b;
            }  
        }
        for(int i = Math.max(lenA,lenB) - 1; i >= 0; i--){
            if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if(carry){
                    result ='1' + result;
                } else {
                    result = '0' + result;
                    carry = true;
                }
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0'){
                if(carry){
                    result ='1' + result;
                    carry = false;
                } else {
                    result = '0' + result;
                }
            } else{
                if(carry){
                    result = '0' + result;
                } else {
                    result = '1' + result;
                    carry = false;
                }
            
            }
        }
        if(carry){
            result = "1" + result;
        }
        return result;
    }
}
