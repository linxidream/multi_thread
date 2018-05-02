package communicateInThreads.threadLocal.InheritableThreadLocal;

import java.util.Date;

//public class ThreadLocalExt extends InheritableThreadLocal{
public class ThreadLocalExt extends ThreadLocal{

        @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

/*    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "继承得来旳值";
    }*/
}
