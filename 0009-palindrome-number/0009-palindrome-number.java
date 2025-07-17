class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int n=x;
        int r=0;

        while ( x > 0 ){
            r= r*10+x%10;
            x = x/10;
        }
        return n==r;
    }
}