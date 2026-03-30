class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] result= new int[n];
        int diff=0;
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
            diff=Math.abs(left_sum-right_sum);
            result[i]=diff;
        }
        return result;
    }
}