class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=weights[0];
        int maxsum=0;
        int n=weights.length;
        for(int i=0;i<n;i++)
        {
            low=Math.max(low,weights[i]);
            maxsum+=weights[i];
        }
        int high=maxsum;
        while(low<=high)
        {
            int count=1;
            int sum=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<n;i++)
            {
                if(sum+weights[i]>mid)
                {
                    count++;
                    sum=weights[i];
                }
                else
                {
                    sum=sum+weights[i];
                }
            }
            if(count<=days)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}