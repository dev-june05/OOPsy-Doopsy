// A class that implements Runnable interface to define a thread
class Multi implements Runnable {

    // The run() method contains the code that will be executed by the thread
    public void run() {
        System.out.println("The Thread is running, Runnable was implemented...");
    }

    // Main method to start the thread
    public static void main(String[] args) {
        Multi m1 = new Multi();           // Creating an instance of the class that implements Runnable
        Thread t1 = new Thread(m1);       // Creating a Thread object, passing m1 as the target
        t1.start();                       // Starting the thread which calls run() method
    }
}
