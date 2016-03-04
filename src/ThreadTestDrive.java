class MyRunnable2 implements Runnable {
    public void run() {
        go();
    }

    public void go() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        doMore();
    }

    public void doMore() {
        System.out.println("Top of stack");
    }
}

public class ThreadTestDrive {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable2();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        System.out.println("return to main method");
    }
}