class Solution {
    public double myPow(double x, int n) {
        if(x == 1){
            return 1;
        }
        if(n >= 0){
            return myPos(x,n);
        } else {
             if(n%2 == 0){ 
                 double m = x*x;
                 int l = n/2;
                 return 1/myPos(m,-l);
             }
            return 1/myPos(x,-n);
        }
        
    }
    
    public double myPos(double x, int n){
        if(n==0){
            return 1;
        } else {
            if(n%2 == 0){
                double t = myPos(x,n/2);
                return t*t; 
            } else {
                return x * myPos(x,n-1);
            }
        }
    }
}
