class Solution {
    public int reverse(int x) {
         long l=0;
        String str=String.valueOf(x);
        String s="";
        String symbol="";
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(0))&&i==0){
                symbol = String.valueOf(str.charAt(0));
            }else{
                char n = str.charAt(i);
                s=n+s;
            }
        }
        l=Long.parseLong(symbol+s);
        if(l>Integer.MAX_VALUE || l<Integer.MIN_VALUE){
            return 0;
        }
        return (int)l;
    }
}