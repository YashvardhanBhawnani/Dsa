class Solution {
    public boolean isPalin(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;    
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalin(s,i,j))
                {
                    String temp = s.substring(i,j+1);
                    ans = temp.length() > ans.length() ? temp : ans;
                }
            }
        }
        return ans;
    }
}