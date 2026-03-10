class Solution {
    public int maxVowels(String s, int k) {
        int start=0;
        int end=0;
        int n=s.length();
        int max_count=0;
        int count=0;
        for(end=start;end<n;end++)
        {
            if(end-start+1<=k)
            {
                if(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')
                {
                    count++;
                }
               
            }
            else
            {
                if(s.charAt(start)=='a'||s.charAt(start)=='e'||s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u')
                {
                    count--;
                }
                    start++;
                
                if(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')
                {
                    count++;
                }
            }
           max_count=Math.max(max_count,count);
        }
        // max_count=Math.max(max_count,count);
        return max_count;
    }
}