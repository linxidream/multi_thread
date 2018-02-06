package createThread.sleep;

public class TestGetId {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
