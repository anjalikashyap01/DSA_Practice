class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n=heights.length;
        int height;
        int max_area=0;
        
        for(int i=0;i<=n;i++)
        {
        //     st.push(i);
        // }
        while(!st.isEmpty() && heights[st.peek()]>(i==n?0 :heights[i]))
        {
            height=heights[st.peek()];
            st.pop();
            int width;
            if(st.isEmpty())
            {
               width=i;
            }
            else
            {
                width=i-st.peek()-1;
            }
            int area=height * width;
            max_area=Math.max(max_area,area);
        }
        st.push(i);
        }
return max_area;
    }
}