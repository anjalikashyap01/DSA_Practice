class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        int left_pr=1;
        for(int i=0;i<n;i++)
        {
            ans[i]=left_pr;
            left_pr=left_pr*nums[i];
        }
        int right_pr=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]=ans[i]*right_pr;
            right_pr=right_pr*nums[i];
        }
        return ans;
    }
}