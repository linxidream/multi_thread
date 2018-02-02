package createThread;

public class DataShareP11 extends Thread{
    private int count = 5;
    /**
     * 非线程安全
     */
    /*@Override
    public void run() {
        super.run();
        count--;
        System.out.println("由"+this.currentThread().getName()+"计算count="+count);
    }*/
    /**
     * 线程安全
     */
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由"+this.currentThread().getName()+"计算count="+count);
    }
}
