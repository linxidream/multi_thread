package communicateInThreads.productAndCustomByOpValue;

/**
 * 多对多会出现线程假死，因为没有唤醒全部线程，把notify改为notifyall即可
 * ( ???? 我这个并没有出现线程假死 )
 */
public class TestManyToManyP162 {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP[] = new ThreadP[5];
        ThreadC threadC[] = new ThreadC[5];
        for(int i = 0;i < 5;i++){
            threadP[i] = new ThreadP(p);
            threadP[i].setName("生产者"+(i+1));
            threadC[i] = new ThreadC(c);
            threadC[i].setName("消费者"+(i+1));
            threadP[i].start();
            threadC[i].start();
        }
        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for(int i = 0; i < threads.length;i++){
            System.out.println(threads[i].getName()+" "+threads[i].getState());
        }
    }
}
