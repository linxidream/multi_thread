package createThread.sleep;

public class Mythread2 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run thread2name="+this.currentThread().getName()+"begin ="+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run thread2name="+this.currentThread().getName()+"end ="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
