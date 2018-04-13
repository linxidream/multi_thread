package communicateInThreads.ifOrWhileInWait;

import com.sun.beans.decoder.ValueObject;

public class Subtract {
    private String lock;
    public Subtract(String lock){
        super();
        this.lock = lock ;
    }
    public void sunject(){
        try{
            synchronized (lock){
                if(ValueObject.list.size() == 0){
                    System.out.println("wait begin , ThreadName = "+Thread.currentThread().getName() + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end , ThreadName = " + Thread.currentThread().getName() + System.currentTimeMillis());
                }
                ValueObject.list.remove(0);
                System.out.println("list size = " + ValueObject.list.size());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
