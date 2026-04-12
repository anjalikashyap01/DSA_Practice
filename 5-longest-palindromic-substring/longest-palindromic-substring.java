class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int max_length=0;
        String ans=" ";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(isPalindrome(s,i,j)){
                    int length=j-i+1;
                    if(length>max_length)
                    {
                        max_length=length;
                        ans=s.substring(i,j+1);
                    }
                }
            }
             
        }
         return ans;
      

    }
    public boolean isPalindrome(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}