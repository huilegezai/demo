package com.multithread.test2;

public class MyObject {
    //延迟加载
    private volatile static MyObject myObject;

    private MyObject(){

    }

    public static MyObject getInstance(){

        try {

            if (myObject != null) {

            } else {
                Thread.sleep( 3000 );
                synchronized (MyObject.class) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return myObject;
    }
}
