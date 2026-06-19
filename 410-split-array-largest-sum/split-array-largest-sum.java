class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++)
        {
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(split_require(nums,k,mid))
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    public boolean split_require(int[] nums,int k,int maxsum)
    {
        int count=1;
        int curr_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(curr_sum+nums[i]>maxsum)
            {
                count++;
                curr_sum=nums[i];
            }
            else
            {
                curr_sum=curr_sum+nums[i];
            }
        }
        return count<=k;
    }
}