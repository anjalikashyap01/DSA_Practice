class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max_water=0;
        while(left<right)
        {
            int width=right-left;
            int min_ht=Math.min(height[left],height[right]);
            int water=width*min_ht;
          max_water=Math.max(max_water,water);
          if(height[left]<height[right])
          {
            left++;
          }
          else
          {
            right--;
          }
        }
        return max_water;
        
            }
}