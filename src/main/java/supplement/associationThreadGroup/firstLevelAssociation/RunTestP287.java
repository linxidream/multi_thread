package supplement.associationThreadGroup.firstLevelAssociation;

public class RunTestP287 {
    public static void main(String[] args) {
        ThreadGroup threadGroup=Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(threadGroup,"groupA");
        Runnable runnable = new Runnable(){
            public void run() {
                try {
                    System.out.println("run method");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(group,runnable);
        thread.setName("thread");
        thread.start();

        ThreadGroup[] threadGroups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroups,true);
        System.out.println("main 线程中有多少个子线程："+threadGroups.length + " name :"+threadGroups[0].getName());
        for (int i = 0;i < threadGroups.length;i++){
            if(threadGroups[i] != null){
                System.out.println("threadGroups 中有多少个线程："+threadGroups[i].getName());
            }
        }
        Thread[] threads = new Thread[threadGroups[0].activeCount()];
        threadGroups[0].enumerate(threads);
//        System.out.println(threads[0].getName());
    }
}
