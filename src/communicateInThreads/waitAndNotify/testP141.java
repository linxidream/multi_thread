package communicateInThreads.waitAndNotify;

//wait释放锁  notify不释放
public class testP141 {
    public static void main(String[] args) {

        try {
            Object object = new Object();
            MyList list = new MyList();
            ThreadA threadA = new ThreadA(object,list);
            threadA.setName("A");
            ThreadB threadB = new ThreadB(object,list);
            threadB.setName("B");
            threadA.start();


            Object object1 = new Object();
            MyList list1 = new MyList();
            ThreadA threadA1 = new ThreadA(object1,list1);
            threadA1.setName("A1");
            ThreadB threadB1 = new ThreadB(object1,list1);
            threadB1.setName("B1");
            threadA1.start();

            Thread.sleep(1000);
            threadB.start();

//            Object object1 = new Object();
//            MyList list1 = new MyList();
//            ThreadA threadA1 = new ThreadA(object1,list1);
//            threadA1.setName("A1");
//            ThreadB threadB1 = new ThreadB(object1,list1);
//            threadB1.setName("B1");
//            threadA1.start();
            Thread.sleep(1000);
            threadB1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
