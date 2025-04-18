class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take first string as reference
        String prefix = strs[0];
        
        // Compare prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string doesn't start with the prefix,
            // shorten the prefix by one character from the end
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If prefix becomes empty, return empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}