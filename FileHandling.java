import java.io.*; // Importing required classes for file handling

public class FileHandling {
    public static void main(String[] args) {
        try {
            // Creating File object for "TestFile1.txt"
            File f1 = new File("TestFile1.txt");
            f1.createNewFile(); // Create the file if it doesn't exist

            // Creating File object for "TestFile2.txt"
            File f2 = new File("TestFile2.txt");
            f2.createNewFile(); // Create the file if it doesn't exist

            // Display confirmation of file creation
            System.out.println("File created: " + f1.getName() + " and " + f2.getName());

            // Creating FileWriter objects to write to both files
            FileWriter w1 = new FileWriter("TestFile1.txt");
            FileWriter w2 = new FileWriter("TestFile2.txt");

            // Writing some text to TestFile1.txt
            w1.write("This text will be copied.");
            System.out.println("Done writing in the file.");
            w1.close(); // Closing the writer to save changes

            // Creating FileReader to read content from TestFile1.txt
            FileReader r1 = new FileReader("TestFile1.txt");
            int i; // Variable to hold character read from file

            System.out.println("Reading from the file:");

            // Reading characters from TestFile1.txt one by one
            // and writing them to TestFile2.txt
            while ((i = r1.read()) != -1) {
                System.out.print((char) i); // Display character on console
                w2.write(i); // Write character to TestFile2.txt
            }

            // Closing the reader and writer
            r1.close();
            w2.close();

        } catch (IOException e) {
            // Handling any IO exceptions that might occur
            System.out.println("An error occurred.");
        }
    }
}
