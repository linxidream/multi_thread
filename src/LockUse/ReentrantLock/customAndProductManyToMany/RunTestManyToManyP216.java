package LockUse.ReentrantLock.customAndProductManyToMany;

/**
 * 多对多跟一对一不同的就是唤醒的是全部的线程，防止假死
 */
public class RunTestManyToManyP216 {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA[] threadA = new ThreadA[10];
        ThreadB[] threadB = new ThreadB[10];
        for (int i = 0; i < threadA.length; i++){
            threadA[i] = new ThreadA(myService);
            threadA[i].setName("threadA"+i);
            threadB[i] = new ThreadB(myService);
            threadB[i].setName("threadB"+i);
            threadA[i].start();
            threadB[i].start();
        }

    }
}
