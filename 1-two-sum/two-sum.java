class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int q=0;
        int[] ans= new int[2];
        for(int i=0;i<n;i++)
        {
    
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ans[q]=i;
                    ans[q+1]=j;
                    q++;
                   
                   
                }
               
                
            }

            
        }
        return ans;
    }
}