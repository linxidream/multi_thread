package communicateInThreads.sleepAndJoinDiff;

/**
 * 证明线程休眠不释放锁，join释放锁
 *
 * sleep时间能叠加！（线程a与线程b休眠时间重合引起的，线程a从开始到结束共休眠6s）
 *
 * 跟书上现象不同，并没有等A线程执行完再执行C线程（线程b的run方法不同步，所以需要在线程a外加同步锁，锁为线程b）
 */
public class TestP186 {
    public static void main(String[] args) {

        try {
            ThreadB threadB = new ThreadB();
            ThreadA threadA = new ThreadA(threadB);
            ThreadC threadC = new ThreadC(threadB);
            threadA.start();
            Thread.sleep(1000);
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
