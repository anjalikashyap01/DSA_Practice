/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int largest=Binary_Search_large(mountainArr);
       int ans= Binary_Search_Ascen(mountainArr,0,largest, target);
       if(ans!=-1)
       {
        return ans;
       }
        return Binary_Search_Dscen(mountainArr,largest+1,mountainArr.length()-1,target);
    }
    public static int Binary_Search_large(MountainArray mountainArr)
    {
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end)
        {
        int mid=start+(end-start)/2;
        if(mountainArr.get(mid)<mountainArr.get(mid+1))
        {
            start=mid+1;
        }
        else
        {
        end=mid;
        }
        }
        return start;
    }
    public static int Binary_Search_Ascen(MountainArray mountainArr,int low,int  high,int target)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(mountainArr.get(mid)==target)
            {
                return mid;
            }
            else if(mountainArr.get(mid)>target)
            {
                high=mid-1;
            }
            else
            {
            low=mid+1;
            }
        }
        return -1;
    }
     public static int Binary_Search_Dscen(MountainArray mountainArr,int low,int  high,int target)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(mountainArr.get(mid)==target)
            {
                return mid;
            }
            else if(mountainArr.get(mid)<target)
            {
                high=mid-1;
            }
            else
            {
            low=mid+1;
            }
        }
        return -1;
    }
}