package communicateInThreads.waitAndSleep;

//wait释放锁   sleep不释放
public class testP144 {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }
}
