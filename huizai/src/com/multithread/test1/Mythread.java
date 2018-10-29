package com.multithread.test1;

public class Mythread extends Thread {

    @Override
    public void run() {
        MyObject myObject = MyObject.getInstance();
        System.out.println( myObject.hashCode() );
    }
}
