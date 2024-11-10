// class MyRunnable implements Runnable {
//     private final Object lock = new Object();
//     private volatile boolean suspended = false;

//     public void suspend() {
//         suspended = true;
//     }

//     public void resume() {
//         synchronized (lock) {
//             suspended = false;
//             lock.notify();
//         }
//     }

//     @Override
//     public void run() {
//         try {
//             for (int i = 0; i < 5; i++) {
//                 synchronized (lock) {
//                     while (suspended) {
//                         lock.wait();
//                     }
//                 }
//                 System.out.println("Running... " + i);
//                 Thread.sleep(2000); // Simulate some work
//             }
//         } catch (InterruptedException e) {
//             System.out.println("Thread was interrupted.");
//         }
//     }
// }

// public class SuspendResumeExample {
//     public static void main(String[] args) {
//         MyRunnable myRunnable = new MyRunnable();
//         Thread thread = new Thread(myRunnable);
//         thread.start();

//         try {
//             Thread.sleep(4000); // Let the thread run for a while
//             myRunnable.suspend();
//             System.out.println("Thread suspended.");

//             Thread.sleep(2000); // Wait for 2 seconds

//             myRunnable.resume();
//             System.out.println("Thread resumed.");
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
