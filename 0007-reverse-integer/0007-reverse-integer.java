class Solution {
    public int reverse(int x) {
        int temp = x;
        int dig=0;
        double rev=0;
        while(temp!=0)
        {
            dig = temp % 10;
            rev = rev*10 + dig;
            temp = temp / 10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            {
                return 0;
            }
        }
        return (int) rev;
    }
}