class Solution {
   long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even =(n+1)/2;
        long odd=n/2;
   long evenchoice=solve(5,even);
   long oddchoice=solve(4,odd);
   long total=(evenchoice * oddchoice)%mod;
   return (int) total;
    }
   public long solve(long base,long n)
   {
    if(n==0)
    {
        return 1;
    }
    long half = solve(base,n/2);
    long ans=(half*half)%mod;
    if(n%2==1)
    {
        return (ans*base)%mod;
    }
    return ans;
    }
}