public class ArrayOperations {
    public static void main(String[] args) {
        // Initialize an array
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};
        
        // Find sum
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        
        // Calculate average
        double average = (double) sum / numbers.length;
        
        // Find minimum and maximum
        int min = numbers[0];
        int max = numbers[0];
        
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Print results
        System.out.println("Array: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}