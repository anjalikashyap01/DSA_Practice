class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count=0;
        int curr_sum=0;
        HashMap<Integer,Integer> prefix= new HashMap<>();
        prefix.put(0,1);
        for(int i=0;i<n;i++)
        {
            curr_sum+=nums[i];
            
            
                if(prefix.containsKey(curr_sum-goal))
                {
                    count+=prefix.get(curr_sum-goal);
                }
            
            prefix.put(curr_sum, prefix.getOrDefault(curr_sum,0)+1);
        }
        return count;
    }
}