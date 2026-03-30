class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int left_sum;
        int right_sum;
        int total=0;
        for(int i=0;i<n;i++)
        {
           
            total+=nums[i];
        }
            left_sum=0;
            right_sum=0;
            for(int i=0;i<n;i++)
            {
           
            right_sum=total-left_sum-nums[i];
            
            if(left_sum==right_sum)
            {
                return i;
            }
            else
            {
                left_sum+=nums[i];
            }
        }
        return -1;
    }
}