package communicateInThreads.joinAndMainSequence;

public class ThreadA extends Thread{
    private ThreadB threadB;
    public ThreadA(ThreadB threadB){
        this.threadB = threadB ;
    }

    @Override
    public void run() {
        try {
            synchronized (threadB){
                System.out.println("a begin ="+ System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("a end ="+ System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
