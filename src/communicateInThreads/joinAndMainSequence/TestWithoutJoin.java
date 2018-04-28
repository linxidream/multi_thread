package communicateInThreads.joinAndMainSequence;

/**
 * 没有join方法 mian线程先执行
 */
public class TestWithoutJoin {
    public static void main(String[] args) {
            ThreadB threadB = new ThreadB();
            ThreadA threadA = new ThreadA(threadB);
            threadA.start();
            threadB.start();
            System.out.println("mian end"+System.currentTimeMillis());
    }
}
