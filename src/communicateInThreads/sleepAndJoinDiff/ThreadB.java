package communicateInThreads.sleepAndJoinDiff;

public class ThreadB extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("b run begin = " + System.currentTimeMillis() );
            Thread.sleep(5000);
            System.out.println("b end begin = " + System.currentTimeMillis() );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void bService(){
        System.out.println("bService = " + System.currentTimeMillis());
    }
}
