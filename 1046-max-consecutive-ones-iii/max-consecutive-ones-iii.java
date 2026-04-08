class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int end=0;
        int start=0;
       int max_length=0;
        int count_zero=0;
        while(end<n)
        {
           
             
            if(nums[end]==0)
            {
                count_zero++;
            }
           while(count_zero>k)
           {
            if(nums[start]==0)
            {
                count_zero--;
            }
                start++;
            }
            int count=end-start+1;
            max_length=Math.max(max_length,count);
            end++;
            }
                  return max_length;
    }
}