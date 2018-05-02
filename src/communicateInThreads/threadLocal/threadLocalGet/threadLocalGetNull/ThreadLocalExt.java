package communicateInThreads.threadLocal.threadLocalGet.threadLocalGetNull;

public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return "默认值";
    }
}
