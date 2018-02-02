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
                myThreadP6.sleep(time);
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

        //不共享数据测试运行
        DataNotShare dataNotShare1 = new DataNotShare("A");
        DataNotShare dataNotShare2 = new DataNotShare("B");
        DataNotShare dataNotShare3 = new DataNotShare("C");
        dataNotShare1.start();
        dataNotShare2.start();
        dataNotShare3.start();
    }
}
