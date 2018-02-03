package createThread.threadNotSafe;

public class BLogin extends Thread{
    @Override
    public void run() {
        LoginServletP12.doPoat("b","bb");
    }
}
