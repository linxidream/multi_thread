package LockUse.readWriteLock.readReadShare;

import LockUse.readWriteLock.Service;

public class RunTestP237 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("threadA");
        threadB.setName("threadB");
        threadA.start();
        threadB.start();
    }
}
