package communicateInThreads.join1;

/**
 * join作用：是当前线程无限期的阻塞，等使用join的线程销毁后再执行当前线程后面的代码
 *
 *  （具有使线程排队执行的作用，类似于同步的运行效果）
 *
 *  与synchronized区别：join内部使用wait进行等待，synchronized使用的对象监听器
 */
public class JoinTestP181 {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println(Thread.currentThread().getName() + "我是主线程,我要最后执行" + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
