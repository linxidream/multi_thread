package createThread.threadNotSafe;

public class ALogin extends Thread{
    @Override
    public void run() {
        LoginServletP12.doPoat("a","aa");
    }
}
