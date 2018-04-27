package communicateInThreads.sleep;

public class ThreadA extends Thread{
    private ThreadB threadB;
    public ThreadA(ThreadB threadB){
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try {
            threadB.start();
//        threadB.bService();
            System.out.println("a begin begin = " + System.currentTimeMillis() );
            Thread.sleep(6000);
            System.out.println("a end begin = " + System.currentTimeMillis() );
//            Thread.sleep();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
