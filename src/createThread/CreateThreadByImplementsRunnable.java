package createThread;

public class CreateThreadByImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start");
    }
}
