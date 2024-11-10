// class GoodMorningRunnable implements Runnable {
//     @Override
//     public void run() {
//         while (true) {
//             System.out.println("Good morning");
//             try {
//                 Thread.sleep(1000); // Pause for 1 second
//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted.");
//             }
//         }
//     }
// }

// class WelcomeRunnable implements Runnable {
//     @Override
//     public void run() {
//         while (true) {
//             System.out.println("Welcome");
//             try {
//                 Thread.sleep(1000); // Pause for 1 second
//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted.");
//             }
//         }
//     }
// }

// public class ContinuousPrintExample {
//     public static void main(String[] args) {
//         GoodMorningRunnable goodMorningRunnable = new GoodMorningRunnable();
//         WelcomeRunnable welcomeRunnable = new WelcomeRunnable();
        
//         Thread goodMorningThread = new Thread(goodMorningRunnable);
//         Thread welcomeThread = new Thread(welcomeRunnable);

//         goodMorningThread.start();
//         welcomeThread.start();
//     }
// }
