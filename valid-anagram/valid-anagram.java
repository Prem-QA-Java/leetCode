class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1=t.toCharArray();
        char[] c=s.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c);
        s=String.valueOf(c1);
	    t=String.valueOf(c);
		if(s.equals(t)) {
		    return true;		
		}else {
			return false;
		}
    }
}