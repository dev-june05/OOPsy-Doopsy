class Solution {
    public int reverse(int x) {
        // Initialize result
        int result = 0;
        
        // Process each digit
        while (x != 0) {
            // Get the last digit
            int digit = x % 10;
            
            // Check for potential overflow before adding the next digit
            // If result > MAX_VALUE/10 or result == MAX_VALUE/10 and digit > 7, we'll overflow
            // If result < MIN_VALUE/10 or result == MIN_VALUE/10 and digit < -8, we'll underflow
            if (result > Integer.MAX_VALUE / 10 || 
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || 
                (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            // Update the result
            result = result * 10 + digit;
            
            // Remove the last digit from x
            x /= 10;
        }
           return result;
    }
}

class ReverseInteger{
    public static void main(String[]args){

        Solution test = new Solution();
        int a = test.reverse(123);
            System.out.println("Reversed Integer:" + a);

        int b = test.reverse(-543);
            System.out.println("Reversed Integer:" + b);
        int c = test.reverse(416);
            System.out.println("Reversed Integer:" + c);
    }
}
