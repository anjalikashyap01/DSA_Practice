class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        int[] p_count=new int[26];
        int[] s_count=new int[26];
        ArrayList result = new ArrayList();
        if(m>n)
        {
            return result;
        }
        for(int i=0; i<m ;i++)
        {
            p_count[p.charAt(i)-'a']++;
            s_count[s.charAt(i)-'a']++;
        }
            if(Arrays.equals(p_count,s_count))
            {
                result.add(0);
        }
        
        for(int j=m;j<n;j++)
        {
            s_count[s.charAt(j)-'a']++;
            s_count[s.charAt(j-m)-'a']--;
        
        if(Arrays.equals(p_count,s_count))
        {
            result.add(j-m+1);
        }
        }
        return result;

    }
}