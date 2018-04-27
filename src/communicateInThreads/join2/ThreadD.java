package communicateInThreads.join2;

public class ThreadD extends Thread{
    private ThreadA threadA;
    public ThreadD(ThreadA threadA){
        this.threadA = threadA;
    }
    @Override
    public void run() {
        threadA.interrupt();
        System.out.println("success" + Thread.currentThread().getState() + Thread.currentThread().getName());
    }
}
