class Solution {
    public void reverseString(char[] s) {
        char[] ch = new char[s.length];
        int l = s.length;
        
        for(int i=0; i<s.length/2;i++){
            char n = s[i];
            s[i]=s[l-1];
            s[l-1]=n;
            l=l-1;
        }
    }
}