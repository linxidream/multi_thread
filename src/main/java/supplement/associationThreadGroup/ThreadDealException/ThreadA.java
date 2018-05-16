package supplement.associationThreadGroup.ThreadDealException;

public class ThreadA extends Thread {
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
