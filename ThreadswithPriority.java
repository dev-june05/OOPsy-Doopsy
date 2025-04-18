// Class Even extends Thread to define a thread that prints even numbers
class Even extends Thread {

    // run() method for Even thread
    public void run() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("Even Thread: " + i); // Print even numbers from 0 to 20
        }
    }

    // Static inner class Odd extends Thread to define another thread that prints odd numbers
    static class Odd extends Thread {
        
        // run() method for Odd thread
        public void run() {
            for (int j = 1; j <= 20; j += 2) {
                System.out.println("Odd Thread: " + j); // Print odd numbers from 1 to 19
            }
        }
    }

    // Main method to start and control thread execution
    public static void main(String[] args) {
        
        Even t1 = new Even();     // Creating Even thread
        Odd t2 = new Odd();       // Creating Odd thread

        // Setting priorities (though may not affect actual scheduling)
        t1.setPriority(Thread.MAX_PRIORITY);  // High priority to even thread
        t2.setPriority(Thread.MIN_PRIORITY);  // Low priority to odd thread

        t1.start();   // Start even thread

        try {
            t1.join();  // Wait for even thread to finish before starting odd thread
        } catch (InterruptedException e) {
            System.out.println("Error Occurred.");
        }

        t2.start();   // Start odd thread

        try {
            t2.join();  // Wait for odd thread to finish before ending main thread
        } catch (InterruptedException e) {
            System.out.println("Error Occurred.");
        }

        // Final message from main thread after both threads finish execution
        System.out.println("Main thread execution completed.");
    }
}
