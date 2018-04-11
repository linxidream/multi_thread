package createThread.AtomicIntegerTest;

import com.sun.jndi.toolkit.ctx.AtomicContext;

import java.util.concurrent.atomic.AtomicInteger;

public class testP127 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }
}
