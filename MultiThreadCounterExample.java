// class Counter {
//     private int count = 0;

//     public synchronized void increment() {
//         count++;
//     }

//     public int getCount() {
//         return count;
//     }
// }

// class CounterIncrementer implements Runnable {
//     private final Counter counter;

//     public CounterIncrementer(Counter counter) {
//         this.counter = counter;
//     }

//     @Override
//     public void run() {
//         for (int i = 0; i < 1000; i++) {
//             counter.increment();
//         }
//     }
// }

// public class MultiThreadCounterExample {
//     public static void main(String[] args) {
//         Counter counter = new Counter();

//         Thread thread1 = new Thread(new CounterIncrementer(counter));
//         Thread thread2 = new Thread(new CounterIncrementer(counter));
//         Thread thread3 = new Thread(new CounterIncrementer(counter));

//         thread1.start();
//         thread2.start();
//         thread3.start();

//         try {
//             thread1.join();
//             thread2.join();
//             thread3.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("Final Counter Value: " + counter.getCount());
//     }
// }
