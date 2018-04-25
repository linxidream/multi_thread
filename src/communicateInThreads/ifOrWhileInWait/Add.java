package communicateInThreads.ifOrWhileInWait;

import com.sun.beans.decoder.ValueObject;

import java.util.List;

public class Add {
    private String lock;
    private List<String> list;
    public Add(String lock,List<String> list){
        super();
        this.lock = lock ;
        this.list = list ;
    }
    public void add(){
        synchronized (lock){
            list.add("anything");
            lock.notifyAll();
        }
    }
}
