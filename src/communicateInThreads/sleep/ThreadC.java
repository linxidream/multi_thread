package communicateInThreads.sleep;

public class ThreadC extends Thread{
    private ThreadB threadB;
    public ThreadC(ThreadB threadB){
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        System.out.println("c begin begin = " + System.currentTimeMillis() );
        threadB.bService();
        System.out.println("c end begin = " + System.currentTimeMillis() );
    }
}
