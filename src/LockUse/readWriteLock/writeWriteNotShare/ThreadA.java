package LockUse.readWriteLock.writeWriteNotShare;

import LockUse.readWriteLock.Service;

public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
