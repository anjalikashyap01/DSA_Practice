class Solution {
    public int maxVowels(String s, int k) {
        int max_count=0;
        int start=0;
        int end=0;
        int n=s.length();
        int count=0;
        for(end=0;end<k;end++)
        {
            if(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')
            {
                count++;
            }
        }
            max_count=count;
            
            while(end<n)
            {
                if(end>=k && (s.charAt(start)=='a'||s.charAt(start)=='e'||s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u'))
                {
                    count--;
                }
                start++;
            
            if(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')
            {
                count++;
            }
        if(count>max_count)
        {
            max_count=count;
        }
            
        end++;
       
    }
     return max_count;
    }
}