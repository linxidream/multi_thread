package communicateInThreads.ifOrWhileInWait;

import com.sun.beans.decoder.ValueObject;

import java.util.List;

public class Subtract {
    private String lock;
    private List<String> list;
    public Subtract(String lock,List<String> list){
        super();
        this.lock = lock ;
        this.list = list ;
    }
    public void sunject(){
        try{
            synchronized (lock){
                if(list.size() == 0){
                    System.out.println("wait begin , ThreadName = "+Thread.currentThread().getName() + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end , ThreadName = " + Thread.currentThread().getName() + System.currentTimeMillis());
                }
                list.remove(0);
                System.out.println("list size = " + list.size());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
