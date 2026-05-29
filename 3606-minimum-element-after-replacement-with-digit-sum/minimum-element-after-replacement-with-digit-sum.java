class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
             int sum=0;
            while(nums[i]>0)
            {
                int rem=nums[i]%10;
                sum=sum+rem;
                nums[i]=nums[i]/10;
            }
            ans[i]=sum;
        }
        int min=ans[0];
        for(int i=1;i<n;i++)
        {
            if(ans[i]<min)
            {
                min=ans[i];
            }
        }
        return min;
    }
}