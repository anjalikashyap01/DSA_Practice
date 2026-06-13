class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        long ans=0;
        if(s.length()==0)
        {
            return 0;
        }
        if(s.charAt(0)=='-')
        {
         return   checkAns(s,-1,1,ans);
        }
        if(s.charAt(0)=='+')
        {
          return   checkAns(s,1,1,ans);
        }
        return checkAns(s,1,0,ans);

    }
    public static int checkAns(String s,int sign,int i,long ans)
    {
        if(i>=s.length())
        {
            return (int) ans*sign;
        }
        if(s.charAt(i)< '0' || s.charAt(i)>'9')
        {
            return (int) ans*sign;
        }
        int digit=s.charAt(i)-'0';
        ans=ans*10+digit;
        if(ans*sign>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        if(ans*sign<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        return checkAns(s,sign,i+1,ans);
    }
}