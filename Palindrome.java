class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers cannot be palindromes because of the minus sign
        if (x < 0) {
            return false;
        }
        
        // Single digit numbers are always palindromes
        if (x >= 0 && x < 10) {
            return true;
        }
        
        // Numbers ending with 0 cannot be palindromes unless the number is 0
        if (x % 10 == 0 && x != 0) {
            return false;
        }
        
        // Reverse the second half of the number
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // For even number of digits: x == reversed
        // For odd number of digits: x == reversed/10 (to remove the middle digit)
        return x == reversed || x == reversed / 10;
    }
}