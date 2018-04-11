package communicateInThreads.beforeWaitAndNotify;

public class testP135 {


    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA threadA = new ThreadA(list);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(list);
        threadB.setName("B");
        threadB.start();
    }
}
