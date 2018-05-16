package supplement.associationThreadGroup.ThreadGroupDealException;

/**
 * 一个线程异常，其它线程也停止；通过重写uncaughtException方法，且run方法内不能有异常
 */
public class MyThreadGroup extends ThreadGroup{

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
