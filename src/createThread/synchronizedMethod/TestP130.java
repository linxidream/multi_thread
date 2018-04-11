package createThread.synchronizedMethod;

public class TestP130 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
        System.out.println("已经发起停止命令了");
    }
}
