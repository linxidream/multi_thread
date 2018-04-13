package communicateInThreads.waitAndInterrupt;

//wait释放锁 interrupt停止线程
public class testP147 {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        threadA.interrupt();
    }
}
