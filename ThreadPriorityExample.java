class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Current Thread Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setPriority(Thread.MAX_PRIORITY); // Set priority
        thread.start();
    }
}
