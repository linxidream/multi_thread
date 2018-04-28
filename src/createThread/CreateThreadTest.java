package createThread;

public class CreateThreadTest {
    public static void main(String[] args) {
        /*
        //创建线程 test
        CreateThreadByExtendsThread createThreadByExtendsThread =new CreateThreadByExtendsThread();
        createThreadByExtendsThread.start();
        System.out.println("运行结束");
        */

       /*
       //创建线程 实现接口
        Runnable runnable = new CreateThreadByImplementsRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("end");
        */

       /*
        //线程的异步执行
        try{
            MyThreadP6 myThreadP6 = new MyThreadP6();
            myThreadP6.setName("myThread");
            myThreadP6.start();
            for(int i = 0; i < 10; i++){
                int time = (int) (Math.random() * 1000);
                myThreadP6.sleepAndJoinDiff(time);
                System.out.println("main "+ i + " = " + myThreadP6.currentThread().getName());
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }*/

       /*
       //start顺序与县城启动顺序关系  (start的顺序不是线程启动顺序)
        MythreadP7 mythreadP71 = new MythreadP7(1);
        MythreadP7 mythreadP72 = new MythreadP7(2);
        MythreadP7 mythreadP73 = new MythreadP7(3);
        MythreadP7 mythreadP74 = new MythreadP7(4);
        MythreadP7 mythreadP75 = new MythreadP7(5);
        MythreadP7 mythreadP76 = new MythreadP7(6);
        mythreadP71.start();
        mythreadP72.start();
        mythreadP73.start();
        mythreadP74.start();
        mythreadP75.start();
        mythreadP76.start();*/

  /*      //不共享数据测试运行
        DataNotShareP10 dataNotShareP101 = new DataNotShareP10("A");
        DataNotShareP10 dataNotShareP102 = new DataNotShareP10("B");
        DataNotShareP10 dataNotShareP103 = new DataNotShareP10("C");
        dataNotShareP101.start();
        dataNotShareP102.start();
        dataNotShareP103.start();*/

        //共享数据测试运行
        //线程不安全
/*        DataShareP11 dataShareP11 = new DataShareP11();
        Thread a=new Thread(dataShareP11,"A");
        Thread b=new Thread(dataShareP11,"B");
        Thread c=new Thread(dataShareP11,"C");
        Thread d=new Thread(dataShareP11,"D");
        Thread e=new Thread(dataShareP11,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();*/

        //printf i--时的线程不安全
       /* MyThreadP14 mythreadP14 = new MyThreadP14();
        Thread thread1 = new Thread(mythreadP14);
        Thread thread2 = new Thread(mythreadP14);
        Thread thread3 = new Thread(mythreadP14);
        Thread thread4 = new Thread(mythreadP14);
        Thread thread5 = new Thread(mythreadP14);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();*/

    }
}
