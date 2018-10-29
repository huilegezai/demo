package com.Lock._1;

public class MyThread extends Thread{
    private com.Lock._1.test1 test1;

    public MyThread(){
        test1 = new test1();
    }

    @Override
    public void run() {
        super.run();
        test1.testLock();
    }
}
