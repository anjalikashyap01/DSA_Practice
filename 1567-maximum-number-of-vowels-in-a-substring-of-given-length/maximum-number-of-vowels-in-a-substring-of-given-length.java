class Solution {
    boolean is_vowel(char c)
    {
        return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int max_count=0;
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(is_vowel(s.charAt(i)))
            {
                count++;
            }
            max_count=count;
        }
        for(int i=k;i<n;i++)
        {
            if(is_vowel(s.charAt(i-k)))
            {
                count--;
            }
            if(is_vowel(s.charAt(i)))
            {
                count++;
            }
             max_count=Math.max(max_count,count);
        }
       
        return max_count;

    }
}