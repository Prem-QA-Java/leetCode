class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
		String ch = "";
		String t = "";
	     
	     for(int i=0;i<s.length();i++) {
	    	 if(Character.isLetterOrDigit(s.charAt(i))){
	    		 t=t+s.charAt(i);
	    	 }
	     }
	     for(int i=0;i<t.length();i++) {
	    	 ch=t.charAt(i)+ch;
	     }
	     if(t.equals(ch)) {
	    	 return true;
	     }else {
	    	 return false;
	     }
    }
}