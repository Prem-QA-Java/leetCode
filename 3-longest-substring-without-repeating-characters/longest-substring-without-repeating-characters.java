class Solution {
    public int lengthOfLongestSubstring(String s) {

        String[] sr=s.split("");
        
        int[] n=new int[sr.length];
        for(int i=0;i<sr.length;i++){
            String s1="";
            s1=s1+sr[i];
            for(int j=i+1;j<sr.length;j++){
                if(s1.contains(sr[j])){
                	break;
                }else if(s1.equals(sr[j])){
                    break;
                }else{
                    s1=s1+sr[j];
                }
            }
            n[i]=s1.length();
        }
        int max = n[0];
        for(int i=0; i<n.length; i++){
            if(max < n[i]){
                max = n[i];
            }
        }
        return max;
    }
}