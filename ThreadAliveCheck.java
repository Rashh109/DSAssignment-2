// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         try {
//             Thread.sleep(1000); // Simulate some work
//         } catch (InterruptedException e) {
//             System.out.println("Thread was interrupted.");
//         }
//         System.out.println("Hello from the thread!");
//     }
// }

// public class ThreadAliveCheck {
//     public static void main(String[] args) {
//         MyRunnable myRunnable = new MyRunnable();
//         Thread thread = new Thread(myRunnable);
//         thread.start();

//         System.out.println("Thread is alive: " + thread.isAlive());

//         try {
//             thread.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
