package communicateInThreads.joinAndMainSequence;

/**
 * join()先抢到锁
 *
 * 【 不明白  不明白  不明白 】
 */
public class TestWithJoin {
    public static void main(String[] args) {

        try {
            ThreadB threadB = new ThreadB();
            ThreadA threadA = new ThreadA(threadB);
            threadA.start();
            threadB.start();
            threadB.join(2000);
            System.out.println("mian end"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
