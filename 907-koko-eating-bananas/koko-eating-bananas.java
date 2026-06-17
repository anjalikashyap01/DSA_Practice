class Solution {
    public int minEatingSpeed(int[] piles, int h) {
                int start=1;
                int end=0;
                int n=piles.length;
                for(int i=0;i<n;i++)
                {
                    if(piles[i]>end)
                    {
                        end=piles[i];
                    }
                }
                int ans=end;
                while(start<=end)
                {
                    int mid=start+(end-start)/2;
                    long res=0;
                    for(int i=0;i<piles.length;i++)
                    {
                        res+=(int)Math.ceil((double)piles[i]/mid);
                    }
                    if(res<=h)
                    {
                        ans=mid;
                        end=mid-1;

                    }
                    else
                    {
                        start=mid+1;
                    }
                }
                return ans;
    }
}