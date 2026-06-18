class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr= new int[n+m];
        double res=0;
       int k=0;
        for(int i=0;i<n;i++)
        {
           arr[k]=nums1[i];
           k++;
        }
         for(int i=0;i<m;i++)
        {
           arr[k]=nums2[i];
           k++;
        }
        Arrays.sort(arr);
        
     return Binary_Search(arr,res);
    }
        public static double Binary_Search(int[] arr,double res)
        {
            int start=0;
            int end=arr.length-1;
            int mid=start+(end-start)/2;
            int mid2=mid+1;
            if(arr.length%2==0)
            {
                res=(double)(arr[mid]+arr[mid2])/2;
                return res;
            }
            else
            {
                return (double)arr[mid];
        }

    
}
}