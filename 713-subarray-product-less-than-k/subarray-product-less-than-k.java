class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n =nums.length;
        int start=0;
        int end=0;
        int count=0;
        int product=1;
        if(k<=1)
        {
            return 0;
        }
        for(end=0;end<n;end++)
        {
            product=product*nums[end];
          while(product>=k)
            {
                product=product/nums[start];
                start++;
            }
            count=count+(end-start+1);
        }
        return count;
    }
}