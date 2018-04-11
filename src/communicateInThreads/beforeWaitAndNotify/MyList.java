package communicateInThreads.beforeWaitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List list = new ArrayList<>();
    public void add(){
        list.add("aaa");
    }
    public int getSize(){
        return list.size();
    }
}
