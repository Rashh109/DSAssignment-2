// class MyRunnable implements Runnable {
//     private volatile boolean running = true;

//     public void stop() {
//         running = false;
//     }

//     @Override
//     public void run() {
//         while (running) {
//             System.out.println("Thread is running...");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 System.out.println("Thread was interrupted.");
//             }
//         }
//         System.out.println("Thread is stopped.");
//     }
// }

// public class StopThreadExample {
//     public static void main(String[] args) {
//         MyRunnable myRunnable = new MyRunnable();
//         Thread thread = new Thread(myRunnable);
//         thread.start();

//         try {
//             Thread.sleep(5000);
//             myRunnable.stop();
//             System.out.println("Requested to stop the thread.");
//             thread.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
