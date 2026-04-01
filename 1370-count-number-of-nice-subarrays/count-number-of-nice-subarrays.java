class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int odd_count=0;
        int end=0;
        int start=0;
        int temp=0;
        while(end<n)
        {
            if(nums[end]%2==1)
            {
                odd_count++;
           
                temp=0;
            }
            while(odd_count==k)
            {
                temp++;
            
            if(nums[start]%2==1)
            {
                odd_count=odd_count-1;
            }
                start++;
            }
            
            count+=temp;
            
            end++;
        }
        return count;
    }
}