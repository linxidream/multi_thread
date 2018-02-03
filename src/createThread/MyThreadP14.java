package createThread;

public class MyThreadP14 extends Thread{
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i="+(i--)+"   threadName="+Thread.currentThread().getName());
    }
}
