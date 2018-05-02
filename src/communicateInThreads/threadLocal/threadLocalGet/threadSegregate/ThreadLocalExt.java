package communicateInThreads.threadLocal.threadLocalGet.threadSegregate;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
