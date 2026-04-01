class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefix = new HashMap<>();
        int n=nums.length;
        int count=0;
        int curr_sum=0;
        prefix.put(0, 1);
        for(int i=0;i<n;i++){
        curr_sum+=nums[i];
        if(prefix.containsKey(curr_sum-k))
        {
            count+=prefix.get(curr_sum-k);
        }
        prefix.put(curr_sum ,prefix.getOrDefault(curr_sum,0)+1);
        }
        return count;
    }
}