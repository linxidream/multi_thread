package LockUse.ReentrantLock.customAndProductOneToOne;

public class RunTestP214 {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.setName("threadA");
        threadB.setName("threadB");
        threadA.start();
        threadB.start();
    }
}
