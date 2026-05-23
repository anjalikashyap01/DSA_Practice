class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] res = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
        int second_num=target-nums[i];
        
        if(map.containsKey(second_num)&&map.get(second_num)!=i)
        {
            res[0]=i;
            res[1]=map.get(second_num);
            return res;
        }
        }
        return res;
    }
}