package communicateInThreads.join2;

/**
 * join()和interrupt()遇到会出现异常
 */
public class TestJoinAndInterrupt {
    public static void main(String[] args) {
        try {
            ThreadB threadB = new ThreadB();
            threadB.start();
            Thread.sleep(1000);
            ThreadC threadC = new ThreadC(threadB);
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
