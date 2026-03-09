class Solution {
    public int minimumRecolors(String blocks, int k) {
        int start=0;
        int end=0;
        int n=blocks.length();
        int count=0;
        int result=Integer.MAX_VALUE;
        for(start=end;end<n;end++)
        {
            
            if(end<k){
            if(blocks.charAt(end)=='W')
            {
                count++;
            
            }
            }
            else
            {
                result=Math.min(result,count);
                   if(blocks.charAt(start)=='W')
                   {
                    count--;
                   }
                    start++;
                    if(blocks.charAt(end)=='W')
                    {
                        count++;
                    }
                   
                }
            }
        
        result=Math.min(result,count);
        return result;
    }
}