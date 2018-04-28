package communicateInThreads.joinAndMainSequence;

public class ThreadB extends Thread{
    @Override
    synchronized public void run() {
        try {
            System.out.println("b begin ="+ System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b end ="+ System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    }
}
