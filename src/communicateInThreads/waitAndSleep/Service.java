package communicateInThreads.waitAndSleep;

public class Service {

    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println(Thread.currentThread()+" start wait "+System.currentTimeMillis());
//                lock.wait();
                Thread.sleep(1000);
                System.out.println(Thread.currentThread()+" wait end "+System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
