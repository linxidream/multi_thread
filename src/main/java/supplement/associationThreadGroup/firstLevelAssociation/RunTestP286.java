package supplement.associationThreadGroup.firstLevelAssociation;

public class RunTestP286 {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        ThreadGroup threadGroup = new ThreadGroup("线程组");
        Thread A = new Thread(threadGroup,threadA);
        Thread B = new Thread(threadGroup,threadB);
        A.start();
        B.start();
        System.out.println("活动的线程组数为："+threadGroup.activeCount());
        System.out.println("线程组的名称为："+threadGroup.getName());
    }
}
