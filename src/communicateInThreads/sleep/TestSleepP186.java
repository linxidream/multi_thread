package communicateInThreads.sleep;

/**
 * sleep时间能叠加！！！
 *
 * 跟书上现象不同，并没有等A线程执行完再执行C线程，
 */
public class TestSleepP186 {
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
