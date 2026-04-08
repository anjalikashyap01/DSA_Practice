class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mp= new HashMap<>();
        int count=0;
        int curr_sum=0;
        mp.put(0,1);
        for(int i=0;i<n;i++)
        {
         curr_sum+=nums[i];
       int  rem=curr_sum%k;
       if(rem<0)
       {
        rem=rem+k;
       }
        if(mp.containsKey(rem))
        {
            count+=mp.get(rem);
        }
        mp.put(rem,mp.getOrDefault(rem,0)+1);

    }
    return count++;
    }
}