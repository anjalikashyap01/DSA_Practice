class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        
        
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            int rem;
            if(k!=0)
            {
                rem=sum%k;
            }
            else
            {
                rem=sum;
            }
            if(map.containsKey(rem))
            {
                int prev_idx=map.get(rem);
                if(i-prev_idx>=2)
                {
                return true;
                }
            }
                else
                {
                    map.put(rem,i);
                }
            }
        
        return false;
    }
}