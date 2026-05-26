class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lower_alpha = new HashSet<>();
        HashSet<Character> upper_alpha = new HashSet<>();
        char[] arr = word.toCharArray();
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                lower_alpha.add(arr[i]);
            }
            if(arr[i]>='A' && arr[i]<='Z')
            {
                upper_alpha.add(arr[i]);
            }
        }
        for(int i=0; i<arr.length ;i++)
        {
             if(arr[i]>='a' && arr[i]<='z')
            {
                if(upper_alpha.contains((char)(arr[i]-32)))
                count++;
                lower_alpha.remove(arr[i]);
                upper_alpha.remove((char)(arr[i]-32));
            }
        
        
            else if(arr[i]>='A' && arr[i]<='Z')
            {
                if(lower_alpha.contains((char)(arr[i]+32)))
                count++;
                upper_alpha.remove(arr[i]);
                lower_alpha.remove((char)(arr[i]+32));
            }
        }
        return count;
    }
}