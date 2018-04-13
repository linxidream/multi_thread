package communicateInThreads.ifOrWhileInWait;

import com.sun.beans.decoder.ValueObject;

public class Add {
    private String lock;
    public Add(String lock){
        super();
        this.lock = lock ;
    }
    public void add(){
        synchronized (lock){
            ValueObject
            list.add("anything");
            lock.notifyAll();
        }
    }
}
