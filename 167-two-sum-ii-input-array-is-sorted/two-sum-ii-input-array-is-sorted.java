class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            map.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++)
        {
            int second_num= target-numbers[i];
            if(map.containsKey(second_num))
            {
                ans[0]=i+1;
                ans[1]=map.get(second_num)+1;
                return ans;
            }
        }
        return ans;
    }
}