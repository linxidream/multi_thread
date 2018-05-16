package supplement.associationThreadGroup.manyThreadSequence;

public class RunTestP292Copy {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadACopy threadACopy = new ThreadACopy(lock,"A",1);
        ThreadACopy threadB = new ThreadACopy(lock,"B",2);
        ThreadACopy threadC = new ThreadACopy(lock,"C",0);
        threadACopy.start();
        threadB.start();
        threadC.start();
    }
}
