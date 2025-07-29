class Solution {
    public String intToRoman(int num) {
        String [] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<13;i++)
        {
            while(num>=val[i])
            {
                ans.append(symbols[i]);
                num-=val[i];
            }
        }
        return ans.toString();
    }
}