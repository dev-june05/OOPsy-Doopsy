// Class to calculate total marks and percentage of a student
class Percentage {

    public static void main(String[] args) {
        
        int total = 0; // Variable to store total marks
        
        // Array containing marks for 5 subjects
        int[] marks = {80, 78, 92, 86, 95};

        // Loop to calculate the sum of all marks
        for (int i = 0; i < 5; i++) {
            total = total + marks[i]; // Add each mark to the total
        }

        // Display total marks
        System.out.println("Total marks of the student: " + total);

        // Calculate percentage (dividing by 5 subjects), using 5f to ensure floating-point division
        float res = (total / 5f);

        // Display the percentage
        System.out.println("Percentage scored: " + res);
    }
}
