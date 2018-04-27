package communicateInThreads.join2;

public class ThreadE extends Thread{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " 我会先执行吗 " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " 我是怎么回事 " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
