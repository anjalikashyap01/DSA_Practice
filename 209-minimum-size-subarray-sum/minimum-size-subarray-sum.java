class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min_length= Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int j=0;
        while(i<n)
        {
            sum=sum+nums[i];
            while(sum>=target)
            {
                // sum=sum-nums[j];
                int index=i-j+1;
                min_length=Math.min(min_length,index);
                sum=sum-nums[j];
                j++;
               
                
            }
            i++;
            
        }
        if(min_length==Integer.MAX_VALUE)
        {
        return 0;
        }
        return min_length;
    }
}