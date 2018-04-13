package communicateInThreads.waitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List list = new ArrayList();
    public void add(){
        list.add(System.currentTimeMillis());
    }
    public int size(){
        return list.size();
    }
}
