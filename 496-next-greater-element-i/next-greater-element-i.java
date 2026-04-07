class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<m;i++)
        {
            while(!st.isEmpty()&& st.peek()<nums2[i])
            {
                mp.put(st.peek(),nums2[i]);
                st.pop();
            }
            st.push(nums2[i]);
        }
            while(!st.isEmpty())
            {
                mp.put(st.peek(),-1);
                st.pop();
            }
            int[] result = new int[n];
            for(int i=0;i<n;i++)

            {
                result[i]=mp.get(nums1[i]);
            }
        
        return result;
    }
}