package supplement.associationThreadGroup.manyThreadSequence;

public class RunTestP292 {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock,"A",1);
        ThreadA threadB = new ThreadA(lock,"B",2);
        ThreadA threadC = new ThreadA(lock,"C",0);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
