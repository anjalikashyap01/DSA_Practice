class Solution {
    public int fib(int n) {
        int f_0=0;
        int f_1=1;
        if(n<2)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}