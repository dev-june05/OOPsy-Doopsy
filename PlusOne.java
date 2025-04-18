class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If we're here, it means all digits were 9, so we need a new array with an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // The first digit becomes 1, rest are already 0
        
        return result;
    }
}