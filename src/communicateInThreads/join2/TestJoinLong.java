package communicateInThreads.join2;

/**
 * 当join加上时间，则当前线程会等加了join的线程那么长时间，然后继续执行
 *
 * （意味着只同步join后面的加的那么长时间，剩下的就是两个线程异步）
 *
 * join(long) 与 sleepAndJoinDiff(long) 效果相同，join(long)内部使用wait方法实现的，具有释放锁的特点
 *
 * （join(long)释放锁，sleep不释放 ）
 */
public class TestJoinLong {
    public static void main(String[] args) {
        try {
            ThreadE threadE = new ThreadE();
            threadE.start();
            threadE.join(1000);
//            Thread.sleepAndJoinDiff(1000);
            System.out.println(Thread.currentThread().getName() + " 我我我 " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
