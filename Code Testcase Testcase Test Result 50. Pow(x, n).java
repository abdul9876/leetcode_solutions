class Solution {
    public double npow(double x, int n){
    if(n==0) return 1;
    double half = npow(x,n/2);
    if(n%2==0) return half*half;
    else return half*half*x;
    }
    public double myPow(double x, int n) {
           int N = n;
        if(N<0){
            x = 1/x;
            N = -N;
        }
        return npow(x,N);

    }
        
    }
   
