// class BankAccount {
//     private double balance;

//     public BankAccount(double initialBalance) {
//         this.balance = initialBalance;
//     }

//     public synchronized void deposit(double amount) {
//         balance += amount;
//         System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Balance: " + balance);
//     }

//     public synchronized void withdraw(double amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Balance: " + balance);
//         } else {
//             System.out.println(Thread.currentThread().getName() + " tried to withdraw: " + amount + ", Insufficient balance!");
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// class DepositRunnable implements Runnable {
//     private BankAccount bankAccount;
//     private double amount;

//     public DepositRunnable(BankAccount bankAccount, double amount) {
//         this.bankAccount = bankAccount;
//         this.amount = amount;
//     }

//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             bankAccount.deposit(amount);
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class WithdrawRunnable implements Runnable {
//     private BankAccount bankAccount;
//     private double amount;

//     public WithdrawRunnable(BankAccount bankAccount, double amount) {
//         this.bankAccount = bankAccount;
//         this.amount = amount;
//     }

//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             bankAccount.withdraw(amount);
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class BankAccountExample {
//     public static void main(String[] args) {
//         BankAccount bankAccount = new BankAccount(2000); // Initial balance

//         DepositRunnable depositRunnable = new DepositRunnable(bankAccount, 300);
//         WithdrawRunnable withdrawRunnable = new WithdrawRunnable(bankAccount, 250);

//         Thread depositThread = new Thread(depositRunnable, "DepositThread");
//         Thread withdrawThread = new Thread(withdrawRunnable, "WithdrawThread");

//         depositThread.start();
//         withdrawThread.start();

//         try {
//             depositThread.join();
//             withdrawThread.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("Final Balance: " + bankAccount.getBalance());
//     }
// }
