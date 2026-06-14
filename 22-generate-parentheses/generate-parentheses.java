class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        generateValidParenthesis(n,0,0,result,"");
        return result;
    }
        public void generateValidParenthesis(int n,int open_bracket,int close_bracket,List<String>result,String curr)
        {
            if(n==open_bracket && n==close_bracket)
            {
                result.add(curr);
                return;
            }
            if(open_bracket<n )
            {
                generateValidParenthesis(n,open_bracket + 1,close_bracket,result,curr + "(");
            }
            if(close_bracket<open_bracket)
            {
                generateValidParenthesis(n,open_bracket,close_bracket+1,result,curr+")");
            }
        }
    }
