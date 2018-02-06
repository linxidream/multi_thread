package createThread.sleep;

public class Mythread1 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run thread1Name="+this.currentThread().getName()+"begin");
            Thread.sleep(1000);
            System.out.println("run thread1Name="+Thread.currentThread().getName()+"begin");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
