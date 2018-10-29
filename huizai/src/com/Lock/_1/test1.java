package com.Lock._1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * rentrankLock类的使用
 *
 */
public class test1 {

    private Lock lock = new ReentrantLock();

    public  void testLock(){

        lock.lock();
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        lock.unlock();
    }

}
