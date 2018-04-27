package communicateInThreads.join1;

public class JoinTestP180 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName() + "我是主线程，我要最后执行" + Thread.currentThread().getState());
    }
}
