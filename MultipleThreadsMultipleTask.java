// Main class extending Thread to define first task
class Multi1 extends Thread {

    // Overriding the run() method to define the task for thread1
    public void run() {
        System.out.println("Task one run by thread1");
    }

    // Static inner class extending Thread to define second task
    static class Multi2 extends Thread {

        // Overriding the run() method to define the task for thread2
        public void run() {
            System.out.println("Task two run by thread2");
        }
    }

    // Main method to start execution
    public static void main(String[] args) {

        // Creating objects for both threads
        Multi1 t1 = new Multi1();      // Thread 1
        Multi2 t2 = new Multi2();      // Thread 2 (from static inner class)

        // Starting both threads
        t1.start();                    // This will call run() of Multi1
        t2.start();                    // This will call run() of Multi2
    }
}
