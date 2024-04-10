class Solution {
    public int firstUniqChar(String s) {
        int n=0;
		char[] ar=s.toCharArray();
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for(char a:ar) {
			if(!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a)+1);
			}
		}
		
		for(Character a:ar) {
			if(map.get(a)==1) {
                n=s.indexOf(a);
                break;
			}else {
                n=-1;
            }
		}
        return n;
    }
}