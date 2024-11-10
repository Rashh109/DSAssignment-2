
// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         //System.out.println("Hello from the thread!");
//         Thread currentThread = Thread.currentThread();
//         // Print the name and state of the currently executing thread
//         System.out.println("Current Thread Name: " + currentThread.getName());
//         System.out.println("Current Thread State: " + currentThread.getState());
//     }
// }
// public class ThreadStateExample {
//     public static void main(String[] args) {
//         MyRunnable myRunnable = new MyRunnable();
//         Thread thread = new Thread(myRunnable);
//         thread.start();

//         try {
//             thread.join();  // Ensures the main thread waits for the child thread to finish
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
