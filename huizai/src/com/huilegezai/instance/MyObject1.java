package com.huilegezai.instance;

public class MyObject1 {
    private static MyObject1 myObject1;
    private MyObject1(){

    }
    synchronized public static MyObject1 getInstance(){
        if(myObject1 != null){

        }else {
            myObject1 = new MyObject1();
        }
        return myObject1;
    }
}
