class Solution {
    public String longestPalindrome(String s) {
        for (int i=s.length(); i>0; i--) {
            for (int j=0;j<=s.length()-i; j++) {
                if (check(j, j+i, s)) {
                    return s.substring(j, j+i);
                }
            }
        }
        return "";
    }

    private boolean check(int i, int j, String s) {
        int leftSide=i;
        int rightSide=j-1;
        while (leftSide<rightSide) {
            if (s.charAt(leftSide)!=s.charAt(rightSide)) {
                return false;
            }
            leftSide++;
            rightSide--;
        }
        return true;
    }
}