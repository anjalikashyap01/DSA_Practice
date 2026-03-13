class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min_length= Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int j=0;
        for(i=0;i<n;i++)
        {
            sum=sum+nums[i];
            while(sum>=target)
            {
                // sum=sum-nums[j];
                min_length=Math.min(min_length,i-j+1);
                sum=sum-nums[j];
                j++;
               
                
            }
            
        }
        if(min_length==Integer.MAX_VALUE)
        {
        return 0;
        }
        return min_length;
    }
}