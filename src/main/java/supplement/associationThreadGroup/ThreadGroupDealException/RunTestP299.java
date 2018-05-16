package supplement.associationThreadGroup.ThreadGroupDealException;

public class RunTestP299 {
    public static void main(String[] args) throws InterruptedException {
//        ThreadGroup threadGroup = new ThreadGroup("我的线程组");
        MyThreadGroup threadGroup = new MyThreadGroup("我的线程组");
        ThreadA threadA = new ThreadA(threadGroup,"报错线程","a");
        threadA.start();
        threadA.join(1000);
        ThreadA[] threadAs = new ThreadA[10];
        for(int i = 0 ; i < threadAs.length; i++){
            threadAs[i] = new ThreadA(threadGroup,"线程"+(i+1),"1");
            threadAs[i].start();
        }
    }
}
