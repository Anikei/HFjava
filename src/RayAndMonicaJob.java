class BankAccount {
    private int balance = 100;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

public class RayAndMonicaJob implements Runnable{

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RayAndMonicaJob theJob = new RayAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithDraw1(10);
            if (account.getBalance() < 0) {
                System.out.println("limit overflow");
            }
        }
    }

    private synchronized void makeWithDraw1(int amount){
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " try to get money");
            try {
                System.out.println(Thread.currentThread().getName() + " go to dream");
                Thread.sleep(500);
            } catch (InterruptedException ex) {ex.printStackTrace();}
            System.out.println(Thread.currentThread().getName() + " wake up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " close transaction");
        } else {
            System.out.println("Sorry, but its not enough money for " + Thread.currentThread().getName());
        }
    }
}