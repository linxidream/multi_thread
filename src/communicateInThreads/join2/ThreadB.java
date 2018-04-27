package communicateInThreads.join2;

public class ThreadB extends Thread{
    @Override
    public void run() {
        try {
            ThreadA threadA = new ThreadA();
            threadA.start();
            threadA.join();
            System.out.println("my name is "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
