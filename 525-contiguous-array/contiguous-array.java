class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] prefix= new int[n];
        map.put(0,-1);
        int  sum=0;
        int max_len=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                sum=sum+(-1);
            }
            else
            {
                sum=sum+1;
            }
            if(map.containsKey(sum))
            {
                int len =i-map.get(sum);
                max_len=Math.max(max_len,len);
            }
            else
            {
                map.put(sum,i);
            }
        }
        return max_len;
    }
}