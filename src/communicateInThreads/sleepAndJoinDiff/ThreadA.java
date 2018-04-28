package communicateInThreads.sleepAndJoinDiff;

public class ThreadA extends Thread{
    private ThreadB threadB;
    public ThreadA(ThreadB threadB){
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try {
            synchronized (threadB){
                threadB.start();
            // 线程休眠不放锁
            /*    System.out.println("a begin begin = " + System.currentTimeMillis() );
                Thread.sleepAndJoinDiff(6000);
                System.out.println("a end begin = " + System.currentTimeMillis() );
            */
            //测试join释放锁
                threadB.join();
                for(int i = 0;i < Integer.MAX_VALUE;i++){
                    System.out.println("a  = " + System.currentTimeMillis() );
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
