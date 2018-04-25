package communicateInThreads.ifOrWhileInWait;

import java.util.ArrayList;
import java.util.List;

// 1、方法外加synchronized，保证整个代码块只能有一个线程在执行
// 2、while循环满足循环条件才会退出循环，接着向下执行
// 3、处于等待区的线程被重新唤醒后会从主存中重新拿数据
// 4、睡眠或等待的线程被唤醒后先进行判断
public class runP157 {

    public static void main(String[] args) {
        String lock = new String ("");
        List<String> list = new ArrayList<>();
        Add add = new Add(lock,list);
        Subtract subtract = new Subtract(lock,list);
        ThreadSubtract threadSubtract = new ThreadSubtract(subtract);
        threadSubtract.setName("threadSubtract");
        threadSubtract.start();
        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("threadSubtract1");
        threadSubtract1.start();
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("threadAdd");
        threadAdd.start();
    }

}
