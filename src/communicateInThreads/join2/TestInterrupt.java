package communicateInThreads.join2;

public class TestInterrupt {
    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            threadA.setName("threadA");
            threadA.start();

            Thread.sleep(500);
            ThreadD threadD = new ThreadD(threadA);
            threadD.setName("threadD");
            threadD.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
