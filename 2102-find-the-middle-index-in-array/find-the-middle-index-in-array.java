class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int left_sum;
        int right_sum;
        for(int i=0;i<n;i++)
        {
            left_sum=0;
            right_sum=0;
            for(int j=0;j<i;j++)
            {
                left_sum+=nums[j];
            }
            for(int j=i+1;j<n;j++)
            {
                right_sum+=nums[j];
            }
            if(left_sum==right_sum)
            {
                return i;
            }
        }
        return -1;
    }
}