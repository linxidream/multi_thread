package createThread.sleep;

public class Run2 {
    public static void main(String[] args) {
        Mythread2 mythread2 = new Mythread2();
        System.out.println("start =" + System.currentTimeMillis());
        mythread2.start();
        System.out.println("end =" + System.currentTimeMillis());
    }
}
