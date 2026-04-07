class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        StringBuilder temp= new StringBuilder();
            for(int i=0;i<n;i++)
            {
                if(temp.length()>0 && temp.charAt(temp.length()-1)==s.charAt(i))
                {
                    temp.deleteCharAt(temp.length()-1);
                }
                else{
                temp.append(s.charAt(i));
                
            }
       
    }
    return temp.toString();
    }
}