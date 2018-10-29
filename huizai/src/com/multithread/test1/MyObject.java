package com.multithread.test1;

public class MyObject {

    //立即加载
    private static MyObject myObject = new MyObject();

    private MyObject(){

    }

    public static MyObject getInstance(){
        return myObject;
    }
}
