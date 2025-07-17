class Solution { 
    public boolean isMatch(String s, String p) { 
       if (s == null || p == null) {
            return false;
        }
        
        int sLength = s.length();
        int pLength = p.length();
        
        // dp[i][j] represents whether s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[sLength + 1][pLength + 1];
        
        // Empty string matches empty pattern
        dp[0][0] = true;
        
        // Handle patterns that can match empty string (e.g., "a*b*c*")
        for (int j = 2; j <= pLength; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= sLength; i++) {
            for (int j = 1; j <= pLength; j++) {
                char currentChar = s.charAt(i - 1);
                char patternChar = p.charAt(j - 1);
                
                if (patternChar == '*') {
                    // Star matches zero or more of the preceding element
                    char precedingChar = p.charAt(j - 2);
                    
                    // Case 1: Use * to match zero occurrences (ignore precedingChar and *)
                    dp[i][j] = dp[i][j - 2];
                    
                    // Case 2: Use * to match one or more occurrences
                    if (isCharacterMatch(currentChar, precedingChar)) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else {
                    // Direct character match or dot match
                    if (isCharacterMatch(currentChar, patternChar)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
            }
        }
        
        return dp[sLength][pLength];
    }
    
    private boolean isCharacterMatch(char stringChar, char patternChar) {
        return patternChar == '.' || stringChar == patternChar;
    } 
}